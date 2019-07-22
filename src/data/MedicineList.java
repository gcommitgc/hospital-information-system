package data;

import java.util.HashMap;

public class MedicineList {

	private HashMap<Medicine,Integer> medicines=new HashMap<>();
	private double price=0;

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
