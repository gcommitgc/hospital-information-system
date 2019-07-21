package data;

import java.util.ArrayList;

public class PatientDataBase {

	private ArrayList<Patient> patient;
	private static PatientDataBase patientDataBase;  
    private PatientDataBase (){}  
    public static synchronized PatientDataBase getInstance() {  
    if (patientDataBase == null) {  
    	patientDataBase = new PatientDataBase();  
    }  
    return patientDataBase;  
    }
}
