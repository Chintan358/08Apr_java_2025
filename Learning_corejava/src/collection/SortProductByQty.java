package collection;

import java.util.Comparator;

public class SortProductByQty implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		
		int a = o1.qty;
		int b = o2.qty;
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
