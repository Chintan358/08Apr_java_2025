package array;

public class ArrayOperations {
	public static void main(String[] args) {
		
		
		
		int a[] = {1000,20,65,8,45,650,12};
		
//		int sum = 0;
//		for (int i = 0; i < a.length; i++)
//		{
//			sum = sum +a[i];
//		}
//		
//		System.out.println(sum);
//		System.out.println(sum/a.length);
		
		
		int max = a[0]; //65
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]>max)
			{
				max=  a[i];
			}
			
			if(a[i]<min)
			{
				min = a[i];
			}
			
		}
		
		System.out.println("Max : "+max);
		System.out.println("Min : "+min);
		
		
		
	}
}
