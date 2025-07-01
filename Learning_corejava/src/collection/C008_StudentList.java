package collection;

import java.util.ArrayList;
import java.util.Collections;

public class C008_StudentList {
	public static void main(String[] args) {
		
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(1, "Harshani", "harshani@gmial.com"));
		al.add(new Student(3,"Kritesh","kritesh@gmail.com"));
		al.add(new Student(2, "kishan", "kishan@gmial.com"));
		
		Collections.sort(al);
		
		for(Student st : al)
		{
			System.out.println(st);
			//st.display();
		}
		 
		
	}
}
