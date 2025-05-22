package oops;

interface I1
{
	public static  final int a = 10;
	public void display();
}

interface I2
{
	public void show();
}

class InterImpl implements I1,I2
{
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display calling.."+a);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}


public class O011_Interfacedemo {
	public static void main(String[] args) {
		
		InterImpl i = new InterImpl();
		i.display();
		
	}
}
