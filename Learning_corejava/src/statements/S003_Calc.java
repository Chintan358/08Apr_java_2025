package statements;

import java.util.Scanner;

public class S003_Calc {
	public static void main(String[] args) {
		
		int choice = 0;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a : ");
		double a = sc.nextDouble();
		System.out.println("enter b : ");
		double b = sc.nextDouble();
		System.out.println("enter choice : ");
		System.out.println("1 : Add ,  2 : sub, 3 : Mul, 4: div, 0: Exit");
		choice = sc.nextInt();
		
		
		if(choice==1)
		{
			System.out.println("Addtion is : "+(a+b));
		}
		else if(choice==2)
		{
			System.out.println("Substraction is : "+(a-b));
		}
		else if(choice==3)
		{
			System.out.println("Multiplication is : "+(a*b));
		}
		else if(choice==4)
		{
			System.out.println("Division is : "+(a/b));
		}
		else if(choice==0)
		{
			System.out.println("You are exit");
		}
		else
		{
			System.out.println("Invalid choice");
		}
		}while(choice!=0);
	}
}
