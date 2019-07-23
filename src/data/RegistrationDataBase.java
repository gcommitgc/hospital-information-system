package data;

import java.util.ArrayList;

public class RegistrationDataBase {

	@SuppressWarnings("unchecked")
	private ArrayList<Registration> registrations=(ArrayList<Registration>)ReadUtil.read("c:/documents/registrationdata.txt");
	private static RegistrationDataBase registrationDataBase;  
    private RegistrationDataBase (){}  
    public static synchronized RegistrationDataBase getInstance() {  
    	if (registrationDataBase == null) {  
    		registrationDataBase = new RegistrationDataBase();  
    	}  
    	return registrationDataBase;  
    }
    public Object[][] displayRegistration(){
    	Object[][] registrationInfo=new Object[registrations.size()][6];
    	int i=0;
    	for(Registration registration:registrations) {
    		Object[] temp= {registration.getRecordid(),registration.getName(),registration.getAge(),registration.getDoctor().getName(),registration.getFinishMedicine(),registration.getFinishPay()};
    		registrationInfo[i]=temp;
    	}
    	return registrationInfo;
    }
    public void Save() {
    	SaveUtil.save(registrations,"c:/documents/registrationdata.txt");
    }

	public ArrayList<Registration> getRegistrations() {
		return registrations;
	}
	public void setRegistrations(ArrayList<Registration> registrations) {
		this.registrations = registrations;
	}
	
}
