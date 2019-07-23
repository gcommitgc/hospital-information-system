package data;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public abstract class SaveUtil {
	public static void save(Object data,String location){
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
    	try {
    		fos = new FileOutputStream(location);
    		oos = new ObjectOutputStream(fos);
    		oos.writeObject(data);
    		oos.flush();
    	} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
				if (oos != null) {
					oos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
