package logic;

import java.util.Map.Entry;

import data.*;


public class CashierSystem {

	private static CashierSystem cashierSystem;
	private CashierSystem() {}
	public synchronized static CashierSystem getInstance() {
		if(cashierSystem==null) {
			cashierSystem=new CashierSystem();
		}
		return cashierSystem;
	}
	OfficeDataBase offices=OfficeDataBase.getInstance();
	RegistrationDataBase registrations=RegistrationDataBase.getInstance();
	
	public Object[][] getInfo(String recordidString){
		int recordid=Integer.parseInt(recordidString);
		int medicineNumber=0;
		Registration thisRegistration=null;
		for(Registration registration:registrations.getRegistrations()) {
			if(registration.getRecordid()==recordid) {
				medicineNumber=registration.getMedicines().getMedicines().size();
				thisRegistration=registration;
				break;
			}
		}
		Object[][] infoBody=new Object[medicineNumber][3];
		int i=0;
		for(Entry<Medicine,Integer> entry:thisRegistration.getMedicines().getMedicines().entrySet()) {
			Object[] temp= {entry.getKey().getName(),entry.getKey().getPrice(),entry.getValue()};
			infoBody[i]=temp;
			i++;
		}
		return infoBody;
	}
	public String getMoney(String recordidString) {
		int recordid=Integer.parseInt(recordidString);
		for(Registration registration:registrations.getRegistrations()) {
			if()
		}
	}
}
