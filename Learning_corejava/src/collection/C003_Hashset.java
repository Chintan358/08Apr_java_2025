package collection;

import java.util.HashSet;

public class C003_Hashset {
	public static void main(String[] args) {
		
		//default  : 16
		//new size : load factor : 0.75
		HashSet<String> hs = new HashSet<String>();
		hs.add("Java");
		hs.add("Python");
		hs.add("Android");
		hs.add("php");
		hs.add("SQL");
		hs.add("Java");
		hs.add(null);
		
		
		for(String s : hs)
		{
			System.out.println(s);
		}
		
		//LinkedHashSet
		//TreeSet
	}
}
