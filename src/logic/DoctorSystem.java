package logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import data.*;

public class DoctorSystem {

	private Doctor doctor;
	RegistrationDataBase registrations=RegistrationDataBase.getInstance();
	OfficeDataBase offices=OfficeDataBase.getInstance();
	MedicineDataBase medicineDataBase=MedicineDataBase.getInstance();
	
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
		Object[][] finishedRegistration=new Object[finishedRegistrationAmount][4];
		for(Registration registration:doctor.getRegistrations()) {
			if(registration.getFinishMedicine()) {
				Object[] temp= {registration.getRecordid(),registration.getName(),registration.getAge(),registration.getSex()};
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
		Object[][] unfinishedRegistration=new Object[unfinishedRegistrationAmount][4];
		for(Registration registration:doctor.getRegistrations()) {
			if(!registration.getFinishMedicine()) {
				Object[] temp= {registration.getRecordid(),registration.getName(),registration.getAge(),registration.getSex()};
				unfinishedRegistration[i]=temp;
				i++;
			}
		}
		return unfinishedRegistration;
	}
	public void makePrescription(String recordid,String diagnose,HashMap<String,Integer> medicineNameAndNumber) {
		Registration registration=null;
		for(Registration aregistration:registrations.getRegistrations()) {
			if(aregistration.getRecordid()==Integer.parseInt(recordid)) {
				registration=aregistration;
			}
		}
		HashMap<Medicine,Integer> medicineAndNumber=new HashMap<>();
		for (Entry<String, Integer> entry : medicineNameAndNumber.entrySet()) {
			for(Medicine medicine:medicineDataBase.getMedicines()) {
				if(entry.getKey().equals(medicine.getName())) {
					medicineAndNumber.put(medicine, entry.getValue());
				}
			}
		}
		MedicineList medicines=new MedicineList(medicineAndNumber);
		registrations.getRegistrations().get(registrations.getRegistrations().indexOf(registration)).setDiagnose(diagnose);
		registrations.getRegistrations().get(registrations.getRegistrations().indexOf(registration)).setMedicines(medicines);
		registrations.getRegistrations().get(registrations.getRegistrations().indexOf(registration)).setFinishMedicine(true);
		registrations.getRegistrations().get(registrations.getRegistrations().indexOf(registration)).setMoney(registrations.getRegistrations().get(registrations.getRegistrations().indexOf(registration)).getMoney()+medicines.getPrice());
		registrations.Save();
		int officeLocation=offices.getOffices().indexOf(doctor.getOffice());
		int doctorLocation=offices.getOffices().get(officeLocation).getDoctors().indexOf(doctor);
		int registrationLocation=offices.getOffices().get(officeLocation).getDoctors().get(doctorLocation).getRegistrations().indexOf(registration);
		offices.getOffices().get(officeLocation).getDoctors().get(doctorLocation).getRegistrations().get(registrationLocation).setDiagnose(diagnose);
		offices.getOffices().get(officeLocation).getDoctors().get(doctorLocation).getRegistrations().get(registrationLocation).setMedicines(medicines);
		offices.getOffices().get(officeLocation).getDoctors().get(doctorLocation).getRegistrations().get(registrationLocation).setFinishMedicine(true);
		offices.getOffices().get(officeLocation).getDoctors().get(doctorLocation).getRegistrations().get(registrationLocation).setMoney(offices.getOffices().get(officeLocation).getDoctors().get(doctorLocation).getRegistrations().get(registrationLocation).getMoney()+medicines.getPrice());
		offices.Save();		
	}
	public ArrayList<String> displayMedicine(){
		ArrayList<String> medicineList=new ArrayList<>();
		for(Medicine medicine:medicineDataBase.getMedicines()) {
			medicineList.add(medicine.getName());
		}
		return medicineList;
	}
	public String getDiscribe(String medicineName) {
		for (Medicine medicine:medicineDataBase.getMedicines()) {
			if(medicine.getName().equals(medicineName)) {
				return medicine.getDiscribe();
			}
		}
		return "wrong";
	}
	
}
