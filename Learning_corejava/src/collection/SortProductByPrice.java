package collection;

import java.util.Comparator;

public class SortProductByPrice implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		
		double a = o1.price;
		double b = o2.price;
		int i=0;
		
		if(a>b)
		{
			i = 1;
		}
		else if(a<b)
		{
			i=-1;
		}
		
		
		return i;
	}

}
