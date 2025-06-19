package fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class F006_Serialization {
	public static void main(String[] args) {
		
		
		Student st = new Student();
		
		try {
			FileOutputStream fos = new FileOutputStream("D:\\Files\\data.ser");
			
			ObjectOutputStream os = new ObjectOutputStream(fos);
			
			os.writeObject(st);
			System.out.println("success");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
