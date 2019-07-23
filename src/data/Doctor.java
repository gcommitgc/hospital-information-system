package data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Doctor implements Serializable{

	private String name;
	private Office office;
	private Date startDate;
	private Date endDate;
	private Boolean level;
	private ArrayList<Registration> registrations=new ArrayList<>();
	
	public Boolean onWork() {
		Date now=new Date();
		try {
			if((now.after(startDate)&&(now.before(endDate)))) {
				return true;
			}
		}
		catch(NullPointerException e) {
			
		}
		return false;
	}
	public ArrayList<Registration> getRegistrations() {
		return registrations;
	}

	public void setRegistrations(ArrayList<Registration> registrations) {
		this.registrations = registrations;
	}

	public Doctor(String name,Office office,Boolean level) {
		this.name=name;
		this.office=office;
		this.level=level;
	}
	
	public Office getOffice() {
		return office;
	}

	public void setOffice(Office office) {
		this.office = office;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Boolean getLevel() {
		return level;
	}

	public void setLevel(Boolean level) {
		this.level = level;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((office == null) ? 0 : office.hashCode());
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
		Doctor other = (Doctor) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (office == null) {
			if (other.office != null)
				return false;
		} else if (!office.equals(other.office))
			return false;
		return true;
	}
	
}
