package data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map.Entry;

public class MedicineList implements Serializable{

	private HashMap<Medicine,Integer> medicines=new HashMap<>();
	private double price=0;

	public MedicineList(HashMap<Medicine, Integer> medicines) {
		super();
		this.medicines = medicines;
		for (Entry<Medicine, Integer> entry : medicines.entrySet()) {
			price+=entry.getKey().getPrice()*entry.getValue();		
		}
	}
	public void addMedicine(Medicine medicine,int num) {
		medicines.put(medicine, num);
		price+=medicine.getPrice()*num;
	}
	public HashMap<Medicine, Integer> getMedicines() {
		return medicines;
	}

	public void setMedicines(HashMap<Medicine, Integer> medicines) {
		this.medicines = medicines;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
