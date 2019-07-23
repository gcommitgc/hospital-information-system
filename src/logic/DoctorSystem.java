package logic;

import data.*;

public class DoctorSystem {

	private Doctor doctor;
	RegistrationDataBase registrations=RegistrationDataBase.getInstance();
	OfficeDataBase offices=OfficeDataBase.getInstance();
	
	public DoctorSystem(String doctorName) {
		for(Office office:offices.getOffices()) {
			for(Doctor doctor:office.getDoctors()) {
				if(doctorName.equals(doctor.getName())) {
					this.doctor=doctor;
					break;
				}
			}
		}
	}
	
	public Object[][] displayFinishedRegistration() {
		int finishedRegistrationAmount=0;
		int i=0;
		for(Registration registration:doctor.getRegistrations()) {
			if(registration.getFinishMedicine()) {
				finishedRegistrationAmount++;
			}
		}
		Object[][] finishedRegistration=new Object[finishedRegistrationAmount][3];
		for(Registration registration:doctor.getRegistrations()) {
			if(registration.getFinishMedicine()) {
				Object[] temp= {registration.getRecordid(),registration.getName(),registration.getAge()};
				finishedRegistration[i]=temp;
				i++;
			}
		}
		return finishedRegistration;
	}
	public Object[][] displayUnfinishedRegistration() {
		int unfinishedRegistrationAmount=0;
		int i=0;
		for(Registration registration:doctor.getRegistrations()) {
			if(!registration.getFinishMedicine()) {
				unfinishedRegistrationAmount++;
			}
		}
		Object[][] unfinishedRegistration=new Object[unfinishedRegistrationAmount][3];
		for(Registration registration:doctor.getRegistrations()) {
			if(registration.getFinishMedicine()) {
				Object[] temp= {registration.getRecordid(),registration.getName(),registration.getAge()};
				unfinishedRegistration[i]=temp;
				i++;
			}
		}
		return unfinishedRegistration;
	}
	public void makePrescription(Registration registration,String diagnose,MedicineList medicines) {
		registrations.getRegistrations().get(registrations.getRegistrations().indexOf(registration)).setDiagnose(diagnose);
		registrations.getRegistrations().get(registrations.getRegistrations().indexOf(registration)).setMedicines(medicines);
		registrations.getRegistrations().get(registrations.getRegistrations().indexOf(registration)).setMoney(registrations.getRegistrations().get(registrations.getRegistrations().indexOf(registration)).getMoney()+medicines.getPrice());
		int officeLocation=offices.getOffices().indexOf(doctor.getOffice());
		int doctorLocation=offices.getOffices().get(officeLocation).getDoctors().indexOf(doctor);
		int registrationLocation=offices.getOffices().get(officeLocation).getDoctors().get(doctorLocation).getRegistrations().indexOf(registration);
		offices.getOffices().get(officeLocation).getDoctors().get(doctorLocation).getRegistrations().get(registrationLocation).setDiagnose(diagnose);
		offices.getOffices().get(officeLocation).getDoctors().get(doctorLocation).getRegistrations().get(registrationLocation).setMedicines(medicines);
		offices.getOffices().get(officeLocation).getDoctors().get(doctorLocation).getRegistrations().get(registrationLocation).setMoney(offices.getOffices().get(officeLocation).getDoctors().get(doctorLocation).getRegistrations().get(registrationLocation).getMoney()+medicines.getPrice());
		
	}
}
