package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class C004_LinkedHashset {
	public static void main(String[] args) {
		
		
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
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
		
		
	}
}
