package array;

public class MDArray {
	public static void main(String[] args) {
		
		
//		int a[][] = new int[3][5];
//		
//		a[0][0] = 20;
//		a[0][1] = 40;
//		a[1][0] = 40;
//		a[1][1] = 50;
//		a[2][0] = 45;
//		a[2][4] = 42;
	
		int a[][] = {{1,2,3,4,5},{5,6,7,8,9},{2,4,6,8,6}};
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<5;j++)
			{
				//System.out.println("Student : "+i+" : "+a[i][j]);
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}
