package logic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import data.*;

public class RegisterSystem {

	private static RegisterSystem registerSystem;
	private RegisterSystem() {}
	public synchronized static RegisterSystem getInstance() {
		if(registerSystem==null) {
			registerSystem=new RegisterSystem();
		}
		return registerSystem;
	}
	OfficeDataBase offices=OfficeDataBase.getInstance();
	RegistrationDataBase registrations=RegistrationDataBase.getInstance();
	public String register(String recordidString,String name,String sex,String idString,String ageString,String date,String wayToPay,String address,Boolean level,String officeName,String doctorName,Boolean needRecordBook,double money) {
		if((recordidString.equals(""))||(name.equals(""))||(idString.equals(""))||(ageString.equals(""))||(date.equals(""))||(address.equals(""))||officeName.equals("请选择科室")||doctorName.equals("请选择医生")) {
			return "lack";
		}
		int recordid=Integer.parseInt(recordidString);
		int id=Integer.parseInt(idString);
		int age=Integer.parseInt(ageString);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birth;
		try {
			birth = sdf.parse(date);
		} catch (ParseException e) {
			return "wrong date";
		}
		Office office=getOffice(officeName);
		Doctor doctor=getDoctor(doctorName);
		Registration registration=new Registration(recordid,name,sex,age,birth,wayToPay,id,address,level,office,doctor,needRecordBook);
		registrations.getRegistrations().add(registration);
		registrations.Save();
		Doctor thisDoctor=registration.getDoctor();
		Office thisOffice=thisDoctor.getOffice();
		int thisOfficeLocation=offices.getOffices().indexOf(thisOffice);
		int thisDoctorLocation=offices.getOffices().get(thisOfficeLocation).getDoctors().indexOf(thisDoctor);
		offices.getOffices().get(thisOfficeLocation).getDoctors().get(thisDoctorLocation).getRegistrations().add(registration);
		offices.Save();
		return "done";
	}
	
	public ArrayList<String> availbleDoctors(Office office){
		ArrayList<String> doctorNames=new ArrayList<>();
		Date now=new Date();
		for(Doctor doctor:office.getDoctors()) {
			if(doctor.onWork()){
				doctorNames.add(doctor.getName());
			}
		}
		return doctorNames;
	}
	
	public ArrayList<String> getOfficeNames(){
		return offices.getOfficeNames();
	}
	
	public ArrayList<String> getDoctorNames(String officeName,Boolean level){
		ArrayList<String> doctorNames=new ArrayList<>();
		for(Office office:offices.getOffices()) {
			if(office.getName().equals(officeName)) {
				for(Doctor doctor:office.getDoctors()) {
					if((doctor.onWork())&&(doctor.getLevel().equals(level))) {
						doctorNames.add(doctor.getName());
					}
				}
				break;
			}
		}
		return doctorNames;
	}
	
	public Office getOffice(String officeName) {
		Office thisoffice=null;
		for(Office office:offices.getOffices()) {
			if(office.getName().equals(officeName)) {
				 thisoffice=office;
			}
		}
		return thisoffice;
	}
	public Doctor getDoctor(String doctorName) {
		Doctor thisdoctor=null;
		for(Office office:offices.getOffices()) {
			for(Doctor doctor:office.getDoctors()) {
				if(doctor.getName().equals(doctorName)) {
					thisdoctor=doctor;
					break;
				}
			}
		}
		return thisdoctor;
	}
	public int getRecordid(){
		int recordid=registrations.getRegistrations().get(registrations.getRegistrations().size()-1).getRecordid()+1;
		return recordid;
	}
	public String getAge(String birth) {
		Date birthday;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			birthday = sdf.parse(birth);
		} catch (ParseException e) {
			return "";
		}
		Date now=new Date();
		if(birthday.after(now)) {
			return "";
		}
		int age=now.getYear()-birthday.getYear()-1;
		if(birthday.getMonth()<now.getMonth()) {
			if(birthday.getDate()<now.getDate()) {
				age++;
			}
		}
		return String.valueOf(age);
	}
	public String withdraw(String recordidString) {
		int recordid;
		try {
			recordid=Integer.parseInt(recordidString);
		}catch(Exception e) {
			return "wrong";
		}
		for(Office office:offices.getOffices()) {
			for(Doctor doctor:office.getDoctors()) {
				for(Registration registration:doctor.getRegistrations()) {
					if(registration.getRecordid()==recordid) {
						ArrayList<Registration> newRegistrations=doctor.getRegistrations();
						newRegistrations.remove(registration);
						doctor.setRegistrations(newRegistrations);
						offices.Save();
					}
				}
			}
		}
		for(Registration registration:registrations.getRegistrations()) {
			if(registration.getRecordid()==recordid) {
				ArrayList<Registration> newRegistrations =registrations.getRegistrations();
				newRegistrations.remove(registration);
				registrations.setRegistrations(newRegistrations);
				registrations.Save();
				return "done";
			}
		}
		return "lack";
	}
}
