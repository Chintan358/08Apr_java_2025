package logical;

public class Fibbonnaci {
	public static void main(String[] args) {
		
		//0 1 1 2 3 5 8 13 
		//0 1 1
		int a = 0; //1 1 2 3
		int b = 1; //1 2 3 5
		
		System.out.print(a+" "+b);
		
		for(int i=3;i<=10;i++)
		{
			int c = a+b; //1 2 3 5
			System.out.print(" "+c);
			a = b;
			b = c;
		}
		
		
	}
}
