package oops;

class Student
{
	Student()
	{
		System.out.println("constructor calling");
	}
	
	Student(String name)
	{
		System.out.println("constructor calling : "+name);
	}
	
	Student(int i)
	{
		System.out.println("id : "+i);
	}
	
	Student(double d)
	{
		System.out.println("number : "+d);
	}
	
	int id;
	String name;
	
	Student(int id, String name)
	{
		this.id = id;
		this.name = name;	
	}
	
	public void display()
	{
		System.out.println(id+" "+name);	
	}
}

public class O002_ConstructorDemo {
	public static void main(String[] args) {
		
		
		
//		Student st1 = new Student("Harshani");
//		Student st2 = new Student(10);
//		Student st3 = new Student(10.23);
		
		Student st = new Student(10,"Kritesh");
		st.display();
		
		Student st1  =new Student(20,"Harshani");
		st1.display();
		
		
	}
}
