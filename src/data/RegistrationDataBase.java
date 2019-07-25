package data;

import java.io.File;
import java.util.ArrayList;

public class RegistrationDataBase {

	@SuppressWarnings("unchecked")
	private static ArrayList<Registration> registrations=(ArrayList<Registration>)ReadUtil.read("c:/documents/registrationdata.txt");
//	private ArrayList<Registration> registrations=new ArrayList<>();
	private static RegistrationDataBase registrationDataBase;  
    private RegistrationDataBase (){}  
    public static synchronized RegistrationDataBase getInstance() {  
    	if (registrationDataBase == null) {  
    		registrationDataBase = new RegistrationDataBase();  
    	}
    	File file=new File("c:/documents/registrationdata.txt");
    	if(file.length()==0) {
    		registrations=new ArrayList<>();
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
