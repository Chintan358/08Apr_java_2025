package ipmclasses;

public class I004_StringBuffernBuilder {
	public static void main(String[] args) {
		
		//sync - slower
		double startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Hello");
		for(int i=1;i<=1000000;i++)
		{
			sb.append("Java");
		}
		double endTime = System.currentTimeMillis();
		
		
		
		//async - fast
		double startTime1 = System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder("Hello");
		for(int i=1;i<=1000000;i++)
		{
			sb1.append("Java");
		}
		double endTime1 = System.currentTimeMillis();
		
		
		System.out.println("Time takne by buffer : "+(endTime-startTime));
		System.out.println("time taken by builder : "+(endTime1-startTime1));
	}
}
