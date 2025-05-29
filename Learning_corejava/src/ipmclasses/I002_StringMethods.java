package ipmclasses;

public class I002_StringMethods {
	public static void main(String[] args) {
		
		
		String s = "Sun rises in East";
		
		System.out.println(s.length());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.charAt(7));
		System.out.println(s.indexOf('i'));
		System.out.println(s.lastIndexOf('i'));
		System.out.println(s.substring(5));
		System.out.println(s.substring(5,11));
		System.out.println(s.replace('s', 'k'));
		System.out.println(s.trim());
		System.out.println(s.startsWith("Su"));
		System.out.println(s.endsWith("t"));
		
		System.out.println("*************************");
		
		String words[] =s.split(" ");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		

		System.out.println("*************************");
		
		char ch[] = s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		System.out.println("*********************");
		
		byte b[] = s.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
