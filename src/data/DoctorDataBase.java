package data;


import java.util.ArrayList;

public class DoctorDataBase {

	private static ArrayList<Doctor> doctors=(ArrayList<Doctor>)ReadUtil.read("c:/documents/doctordata.txt");
	private static DoctorDataBase doctorDataBase;
    private DoctorDataBase (){}
    public static synchronized DoctorDataBase getInstance() {
    	if (doctorDataBase == null) {
    		doctorDataBase = new DoctorDataBase();
    	}
    	return doctorDataBase;
    }
    public void Sava() {
    	SaveUtil.save(doctors,"c:/documents/doctordata.txt");
    }
}
