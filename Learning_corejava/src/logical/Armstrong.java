package logical;

public class Armstrong {
	public static void main(String[] args) {
		
		//153 1+125+27 = 153
		//1634 = 1 + 1296 + 81 + 256
		
		for(int i=100;i<=999;i++)
		{
		
		int number = i;
		int temp = number;
		int sum = 0;
		while(number !=0)
		{
			int rem = number%10;  //3 5 1
			sum = sum+(rem*rem*rem);
			number = number/10;	 //15 1 0
		}
		
		//System.out.println(sum);
		if(temp==sum)
		{
			System.out.println(temp+ ": Armstrong");
		}
		else
		{
			//System.out.println(temp+ ": Not armstrong");
		}
		
		}
	}
}
