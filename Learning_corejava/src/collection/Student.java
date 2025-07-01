package collection;

public class Student  implements Comparable<Student> {
		
			int id;
			String name;
			String email;
			
			public Student(int id, String name, String email) {
				super();
				this.id = id;
				this.name = name;
				this.email = email;
			}
			
			
			public void display()
			{
				System.out.println(id+" "+name+" "+email);
			}


			@Override
			public String toString() {
				return "Student [id=" + id + ", name=" + name + ", email=" + email + "]";
			}


			@Override
			public int compareTo(Student o) {
				
				
				int a = o.id;    
				int b = this.id;  
				int i=0;
				
				if(b>a)
				{
					i = 1;
				}
				else if(b<a)
				{
					i=-1;
				}
				
				return i;
			}
			
			
			
			
}
