package fileio;

import java.io.FileWriter;
import java.io.IOException;

public class F003_FileWriter {
	public static void main(String[] args) {
		
		
		try {
			
			FileWriter  fw = new FileWriter("D:\\Files\\test.txt");
			String str = "This is my first io practical";
			fw.write(str);
			fw.flush();
			System.out.println("success");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
