package collection;

import java.util.Enumeration;
import java.util.Vector;

public class C006_VectoreDemo {
	public static void main(String[] args) {
		
		
		Vector<Integer> vt = new Vector<Integer>();
		vt.addElement(10);
		vt.addElement(20);
		vt.addElement(30);
		vt.addElement(40);
		
		Enumeration<Integer> en = vt.elements();
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
		
	}
}
