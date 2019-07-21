package data;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public abstract class ReadUtil {

	@SuppressWarnings("rawtypes")
	public static Object read(String location) {
		ObjectInputStream ois = null;
		FileInputStream fis = null;
		Object object=null;
		try {
			fis = new FileInputStream(location);
			ois = new ObjectInputStream(fis);
			object = ois.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException e) {
		}
		catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {

				try {
					if(ois !=null){
						ois.close();
					}
					if(fis !=null){
						fis.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		return object;
		}
	}
