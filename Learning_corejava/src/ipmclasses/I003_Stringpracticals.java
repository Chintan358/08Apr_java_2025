package ipmclasses;

public class I003_Stringpracticals {
	public static void main(String[] args) {
		
		
		String str = "fggf Hello java Hello Tops fdfdf";
		
		//Tops Hello java Hello
		//spoT olleH avaj olleH
		//olleH avaj olleH spoT
		//Tops java Hello Hello
		
		
		String words[] = str.split(" ");
		for(int i=words.length-1;i>=0;i--)
		{
			System.out.print(words[i]+" ");
		}
		
		System.out.println();
		System.out.println("******************");
		
		char ch[] = str.toCharArray();
		
		for(int j=ch.length-1;j>=0;j--)
		{
			System.out.print(ch[j]);
		}
		
		System.out.println();
		System.out.println("******************");
		
		for(int i=0;i<words.length;i++)
		{
			char c[] = words[i].toCharArray();
			for(int j=c.length-1;j>=0;j--)
			{
				System.out.print(c[j]);
			}
			System.out.print(" ");
		}
		
		System.out.println();
		System.out.println("******************");
		
		String temp = words[0];
		words[0] = words[words.length-1];
		words[words.length-1] = temp;
		
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}
		
		
		
	}
}
