package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class C001_Arraylist {
	public static void main(String[] args) {
		
		//default size : 10
		//new size : oldsize * 3/2 + 1 = 16
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("Php");
		al.add("Android");
		al.add("Node");
		al.add("React");
		al.add("Java");
		al.add(null);
		al.add("Java");
		al.add("Php");
		al.add("Android");
		al.add("Node");
		al.add("React");
		al.add("Java");
		al.add(null);
		
		//al.add(1,"SQL");
		//al.set(1, "SQL");
		//al.remove(1);
		
		//System.out.println(al.get(2));
		//System.out.println(al.size());
		
		//System.out.println(al.contains("Php"));
		
		System.out.println("**************");
		
		for(String s : al)
		{
			System.out.println(s);
		}
		
		
//		Iterator<String> itr = al.iterator();
//		while(itr.hasNext()) {
//			
//			String data = itr.next();
//			if(data.equals("Php"))
//			{
//				itr.remove();
//			}
//			else
//			{
//				System.out.println(data);
//			}
//		}
		
		
	}
}
