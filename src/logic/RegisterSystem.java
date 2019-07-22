package logic;

import java.util.ArrayList;
import java.util.Date;

import data.*;

public class RegisterSystem {

	OfficeDataBase offices=OfficeDataBase.getInstance();
	RegistrationDataBase registrations=RegistrationDataBase.getInstance();
	public void register(Registration registration) {
		registrations.getRegistrations().add(registration);
		registrations.Save();
		Doctor thisDoctor=registration.getDoctor();
		Office thisOffice=thisDoctor.getOffice();
		int thisOfficeLocation=offices.getOffices().indexOf(thisOffice);
		int thisDoctorLocation=offices.getOffices().get(thisOfficeLocation).getDoctors().indexOf(thisDoctor);
		offices.getOffices().get(thisOfficeLocation).getDoctors().get(thisDoctorLocation).getRegistrations().add(registration);
		offices.Save();
	}
	public ArrayList<String> availbleDoctors(Office office){
		ArrayList<String> doctorNames=new ArrayList<>();
		Date now=new Date();
		for(Doctor doctor:office.getDoctors()) {
			if((doctor.getStartDate().before(now))&&(doctor.getEndDate().after(now))){
				doctorNames.add(doctor.getName());
			}
		}
		return doctorNames;
	}
}
