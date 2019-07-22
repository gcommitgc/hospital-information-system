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
