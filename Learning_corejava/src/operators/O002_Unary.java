package operators;

public class O002_Unary {
	public static void main(String[] args) {
		
		
		//++,--
		
		int a = 10; //10
		int b = a++ + a++ - a-- +a--;
		      
//		System.out.println(++a);
//		System.out.println(a);
		
		System.out.println(a); //13  //    //10 //10
		System.out.println(b); //10  //20  //20
		
		
	}
}
