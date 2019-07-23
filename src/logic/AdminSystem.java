package logic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import data.*;

public class AdminSystem {

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	private static AdminSystem adminSystem;
	private AdminSystem() {}
	public static synchronized AdminSystem getInstance() {  
    	if (adminSystem == null) {  
    		adminSystem = new AdminSystem();  
    	}  
    	return adminSystem;  
    }
	OfficeDataBase offices=OfficeDataBase.getInstance();
	public String setSchedul(String doctorString,String startDateString,String endDateString) {
		Doctor doctor=null;
		Date startDate=null;
		Date endDate=null;
		for(Office office:offices.getOffices()) {
			for(Doctor adoctor:office.getDoctors()) {
				if(adoctor.getName().equals(doctorString)) {
					doctor=adoctor;
				}
			}
		}
		try {
			startDate = sdf.parse(startDateString);
			endDate=sdf.parse(endDateString);
		} catch (ParseException e) {
			return "请按格式输入时间";
		}
		int officeLocation=offices.getOffices().indexOf(doctor.getOffice());
		int doctorLocation=offices.getOffices().get(officeLocation).getDoctors().indexOf(doctor);
		offices.getOffices().get(officeLocation).getDoctors().get(doctorLocation).setStartDate(startDate);
		offices.getOffices().get(officeLocation).getDoctors().get(doctorLocation).setEndDate(endDate);
		offices.Save();
		return "done";
	}
	public Object[][] displaySchedul(){
		int doctorAmount=0;
		int i=0;
		for(Office office:offices.getOffices()) {
			for(Doctor doctor:office.getDoctors()) {
				doctorAmount++;
			}
		}
		Object[][] schedul=new Object[doctorAmount][4];
		for(Office office:offices.getOffices()) {
			for(Doctor doctor:office.getDoctors()) {
				try {
					Object[] temp= {office.getName(),doctor.getName(),sdf.format(doctor.getStartDate()),sdf.format(doctor.getEndDate())};
					schedul[i]=temp;
				}
				catch(NullPointerException e) {
					Object[] temp={office.getName(),doctor.getName(),null,null};
					schedul[i]=temp;
				}
				i++;
			}
		}
		return schedul;
	}
}
