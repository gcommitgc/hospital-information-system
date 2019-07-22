package data;

import java.util.ArrayList;

public class OfficeDataBase {

	@SuppressWarnings("unchecked")
	private static ArrayList<Office> offices=(ArrayList<Office>)ReadUtil.read("c:/documents/officedata.txt");
	private static OfficeDataBase officeDataBase;  
    private OfficeDataBase (){}  
    public static synchronized OfficeDataBase getInstance() {  
    	if (officeDataBase == null) {  
    		officeDataBase = new OfficeDataBase();  
    	}
    	return officeDataBase;  
    }
    public ArrayList<String> getOfficeNames(){
    	ArrayList<String> officeNames=new ArrayList<>();
    	for(Office office:offices) {
    		officeNames.add(office.getName());
    	}
    	return officeNames;
    }
    public void Save() {
    	SaveUtil.save(offices,"c:/documents/officedata.txt");
    }
	public static ArrayList<Office> getOffices() {
		return offices;
	}
	public void setOffices(ArrayList<Office> offices) {
		this.offices = offices;
	}
    
}
