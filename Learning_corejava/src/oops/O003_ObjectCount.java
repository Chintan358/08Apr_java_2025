package oops;

class Demo
{
	static int count  = 0;
	Demo()
	{
		count++;	
	}
}

public class O003_ObjectCount {
	public static void main(String[] args) {
		
		
		Demo d  =new Demo(); //0 1 2
		Demo d1 = new Demo();//
		Demo d2 =new Demo(); //0 1 2
		Demo d3 = new Demo();//
		
		System.out.println(Demo.count);
	}
}
