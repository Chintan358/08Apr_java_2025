package collection;

import java.util.Comparator;

public class SortProductByName implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		
		String a = o1.name;
		String b = o2.name;
		
		return -a.compareTo(b);
		
		
	}

}
