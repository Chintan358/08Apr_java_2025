package logical;

public class Pettern4 {
	public static void main(String[] args) {
		
//		    *
//		   **
//		  ***
//		 ****
//		*****
		
		int lines= 7;
		for(int j=lines;j>=1;j--)
		{
			for(int k=1;k<j;k++)
			{
				System.out.print(" ");
			}
			
			for(int i=0;i<=lines-j;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}	
		
	
	}
}
