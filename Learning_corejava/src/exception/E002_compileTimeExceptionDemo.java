package exception;

class Sample
{
	public void display() throws ClassNotFoundException
	{
			Class.forName("basic.ScannerDemo");
	}
}

public class E002_compileTimeExceptionDemo {
	public static void main(String[] args) {
		
		
		
//		try 
//		{
//
//			Class.forName("basic.ScannerDemo");
//		} 
//		catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		Sample s = new Sample();
		try {
			s.display();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
