package data;

import java.io.Serializable;
import java.util.ArrayList;

public class Office implements Serializable{

	private String name;
	private ArrayList<Doctor> doctors;
	
	public ArrayList<String> getDoctorNames(){
		ArrayList<String> doctorNames=new ArrayList<>();
    	for(Doctor doctor:doctors) {
    		doctorNames.add(doctor.getName());
    	}
    	return doctorNames;
	}
	
	public Office(String name, ArrayList<Doctor> doctors) {
		this.name = name;
		this.doctors = doctors;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}
	public void setDoctors(ArrayList<Doctor> doctors) {
		this.doctors = doctors;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Office other = (Office) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
