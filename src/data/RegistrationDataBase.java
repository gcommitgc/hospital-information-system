package data;

import java.util.ArrayList;

public class RegistrationDataBase {

	private ArrayList<Registration> registration;
	private static RegistrationDataBase registrationDataBase;  
    private RegistrationDataBase (){}  
    public static synchronized RegistrationDataBase getInstance() {  
    if (registrationDataBase == null) {  
    	registrationDataBase = new RegistrationDataBase();  
    }  
    return registrationDataBase;  
    }
}
