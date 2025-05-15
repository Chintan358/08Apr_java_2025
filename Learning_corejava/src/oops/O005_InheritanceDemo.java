package oops;

class A
{
	int id = 10;
	public void display()
	{
		
		System.out.println("running class A display method");
	}
}

class B extends A
{
	int id = 50;

	public void show()
	{
		int id = 100;
		System.out.println(id);
		System.out.println(this.id);
		System.out.println(super.id);
		System.out.println("running show of class B");
	}
	
	
}

//class C extends B
//{
//	 multilevel
//}

//class C extends A
//{
//	hirarchical
//}

//class C extends B,A
//{
//	multiple  - not supported in java
//}

public class O005_InheritanceDemo {
	public static void main(String[] args) {

		B b = new B();
		b.show();
		//b.display();
		
	}
}
