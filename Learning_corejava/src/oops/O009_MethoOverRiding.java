package oops;

class Sample
{
	public void run()
	{
		System.out.println("Running sample class run method...");
	}
	
}

class Run extends Sample
{
	@Override
	public void run() {
		System.out.println("Runing run class run method");
		super.run();
	}
}

public class O009_MethoOverRiding {
	public static void main(String[] args) {
		
		Run r = new Run();
		r.run();
		
	}
}
