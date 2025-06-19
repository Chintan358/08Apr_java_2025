package fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class F001_FileOutputStream {
	
	public static void main(String[] args) {
		
			
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name : ");
		String name = sc.next();
		System.out.println("Enter email : ");
		String email = sc.next();
		
		FileOutputStream fos =null;
		try {
			 fos = new FileOutputStream("D:\\Files\\"+name+".txt");
			String str = "This is my first IO practical";
				
			byte b[] = email.getBytes();
			
			
			fos.write(b);
			System.out.println("success");
			
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(fos!=null)
			{
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			sc.close();
		}
		
		
		
	}

}
