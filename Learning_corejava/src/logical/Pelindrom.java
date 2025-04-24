package logical;

public class Pelindrom {
	public static void main(String[] args) {
		
		int number = 123454321;
		int temp = number;
		int sum = 0;
		while(number!=0)
		{
			int rem = number%10;
			sum =sum*10+rem;
			number = number/10;
		}
		
		//System.out.println(sum);
		if(sum==temp)
		{
			System.out.println("Pelindrom");
		}
		else
		{
			System.out.println("Not pelindrom");
		}
		
		
	}
}
