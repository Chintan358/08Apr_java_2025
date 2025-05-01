package logical;

public class Pettern5 {
	public static void main(String[] args) {
		
//		    *****
//		     ****
//		      ***
//		       **
//		        *
		
		int lines= 7;
		for(int j=lines;j>=1;j--)
		{
			for(int k=1;k<=lines-j;k++)
			{
				System.out.print(" ");
			}
			
			for(int i=1;i<=j;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}	
		
	
	}
}
