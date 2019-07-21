package data;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList<Doctor> doctors=new ArrayList<Doctor>();
//		Doctor d1=new Doctor("¸ß");
//		Doctor d2=new Doctor("Áº");
//		doctors.add(d1);
//		doctors.add(d2);
//		SaveUtil.save(doctors,"c:/documents/doctordata.txt");
		@SuppressWarnings("unchecked")
		ArrayList<Doctor> doctorss=(ArrayList<Doctor>)ReadUtil.read("c:/documents/doctordata.txt");
		System.out.println(doctorss.get(0).getName()+doctorss.get(1).getName());
	}

}
