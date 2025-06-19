package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class F002_FileInputStream {
	public static void main(String[] args) {
		
		
		try {
			FileInputStream fis = new FileInputStream("D://Files//test.txt");
			
			int i=  fis.read();
			while(i!=-1)
			{
				char ch = (char)i;
				System.out.print(ch);
				i = fis.read();
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
