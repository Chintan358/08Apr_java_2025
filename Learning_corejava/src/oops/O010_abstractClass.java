package oops;


abstract class Abs
{
	public abstract void display();
	
	public void show()
	{
		System.out.println("running show method...");
	}
}

class AbsImpl extends Abs
{
	@Override
	public void display() {
	
		System.out.println("Abs display calling");
		
	}
}

public class O010_abstractClass {
	public static void main(String[] args) {
		
		
		//Abs abs = new Abs();
		
//		AbsImpl absi =  new AbsImpl();
//		absi.display();
//		absi.show();
		
		//upcasting
		Abs abs = new AbsImpl();
		abs.display();
		abs.show();
		
		
	}
}
