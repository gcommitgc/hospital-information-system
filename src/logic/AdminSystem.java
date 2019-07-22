package logic;

import java.util.Date;

import data.*;

public class AdminSystem {

	private static AdminSystem adminSystem;
	private AdminSystem() {}
	public static synchronized AdminSystem getInstance() {  
    	if (adminSystem == null) {  
    		adminSystem = new AdminSystem();  
    	}  
    	return adminSystem;  
    }
	OfficeDataBase offices=OfficeDataBase.getInstance();
	public void setSchedul(Doctor doctor,Date startDate,Date endDate) {
		int officeLocation=offices.getOffices().indexOf(doctor.getOffice());
		int doctorLocation=offices.getOffices().get(officeLocation).getDoctors().indexOf(doctor);
		offices.getOffices().get(officeLocation).getDoctors().get(doctorLocation).setStartDate(startDate);
		offices.getOffices().get(officeLocation).getDoctors().get(doctorLocation).setEndDate(endDate);
		offices.Save();
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
				Object[] temp= {office.getName(),doctor.getName(),doctor.getStartDate(),doctor.getEndDate()};
				schedul[i]=temp;
				i++;
			}
		}
		return schedul;
	}
}
