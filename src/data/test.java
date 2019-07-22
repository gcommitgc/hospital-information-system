package data;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Doctor> doctors=new ArrayList<>();
		ArrayList<Office> offices=new ArrayList<>();
		Doctor d1=new Doctor("¸ß");
		Doctor d2=new Doctor("Áº");
		doctors.add(d1);
		doctors.add(d2);
		Office xinnao=new Office("ÐÄÄÔ",doctors);
		offices.add(xinnao);
//		SaveUtil.save(doctors,"c:/documents/doctordata.txt");
		SaveUtil.save(offices,"c:/documents/officedata.txt");
		@SuppressWarnings("unchecked")
		ArrayList<Office> officess=(ArrayList<Office>)ReadUtil.read("c:/documents/officedata.txt");
		System.out.println(officess.get(0).getDoctors().get(1).getName());
//		@SuppressWarnings("unchecked")
//		ArrayList<Doctor> doctorss=(ArrayList<Doctor>)ReadUtil.read("c:/documents/doctordata.txt");
//		System.out.println(doctorss.get(0).getName()+doctorss.get(1).getName()+doctorss.get(0).getOffice());
	}

}
