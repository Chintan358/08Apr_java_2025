package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class C005_TreeSet {
	
		public static void main(String[] args) {
			
			
			TreeSet<String> hs = new TreeSet<String>();
			hs.add("Java");
			hs.add("Python");
			hs.add("Android");
			hs.add("php");
			hs.add("SQL");
			hs.add("Java");
			
			
			
//			for(String s : hs)
//			{
//				System.out.println(s);
//			}
			
			
//			Iterator<String> itr = hs.iterator();
			Iterator<String> itr = hs.descendingIterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
			
		}
}
