package data;

import java.io.Serializable;

public class Doctor implements Serializable{

	private String name;

	public Doctor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
