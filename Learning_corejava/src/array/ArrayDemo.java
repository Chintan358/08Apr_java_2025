package array;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		//declaration
//		int[] a= new int[3];
		
		//initialisation
//		a[0] = 20;
//		a[1] = 30;
//		a[4] = 60;
		//a[6] = 45;
		
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
		
		
		int a[] = {10,20,30,40,50,60};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		String sub[] = {"Java","Python","Php"};
		
		for (int i = 0; i < sub.length; i++) {
			System.out.println(sub[i]);
		}
		
	}
}
