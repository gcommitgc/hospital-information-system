package data;

public class SchedulDataBase {

	private static SchedulDataBase schedulDataBase;  
    private SchedulDataBase (){}  
    public static synchronized SchedulDataBase getInstance() {  
    if (schedulDataBase == null) {  
    	schedulDataBase = new SchedulDataBase();  
    }  
    return schedulDataBase;  
    }
}
