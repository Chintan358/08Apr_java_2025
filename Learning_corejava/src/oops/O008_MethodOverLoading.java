package oops;

class Test
{
	public void add(int a, int b)
	{
		int r = a+b;
		System.out.println("1 Addition is : "+r);
	}
	
	public void add(int a, int b, int c)
	{
		int r = a+b+c;
		System.out.println("2 Addition is : "+r);
	}
	
	public void add(double a, int b)
	{
		double r = a+b;
		System.out.println("3 Addition is : "+r);
	}
	
}

public class O008_MethodOverLoading {
	public static void main(String[] args) {
		
		
		Test t = new Test();
		t.add(10, 20);
		t.add(10, 20, 30);
		t.add(10.55, 30);
		
		
	}
}
