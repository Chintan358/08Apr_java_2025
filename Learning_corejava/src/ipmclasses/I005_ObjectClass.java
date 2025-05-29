package ipmclasses;

class Sample 
{
//	@Override
//	public String toString() {
//		
//		return "Hello";
//	}
	
	int a;
	public Sample(int a) {
		this.a  = a;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Sample s = (Sample) obj;
		boolean b = false;		
		if(this.a==s.a)
		{
			b = true;
		}	
		return b;
	}
}

public class I005_ObjectClass {
	public static void main(String[] args) {
		
//		Sample s = new Sample();
//		//System.out.println(s.getClass());
//		System.out.println(s);
		
		Sample s1 = new Sample(10);
		Sample s2 = new Sample(10);
		
		System.out.println(s1.equals(s2));
		
	}
}
