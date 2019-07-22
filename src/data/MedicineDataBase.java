package data;

import java.util.ArrayList;

public class MedicineDataBase {

	private ArrayList<Medicine> medicines=(ArrayList<Medicine>)ReadUtil.read("c:/documents/medicinedata.txt");
	private static MedicineDataBase medicineDataBase;
	private MedicineDataBase() {}
	public static synchronized MedicineDataBase getInstance() {  
    	if (medicineDataBase == null) {  
    		medicineDataBase = new MedicineDataBase();  
    	}  
    	return medicineDataBase;  
    }
	public ArrayList<Medicine> getMedicines() {
		return medicines;
	}
	public void setMedicines(ArrayList<Medicine> medicines) {
		this.medicines = medicines;
	}
	
}
