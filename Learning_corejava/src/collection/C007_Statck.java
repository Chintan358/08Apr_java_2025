package collection;

import java.util.Stack;

public class C007_Statck {
	public static void main(String[] args) {
		
		
		Stack<String> st = new Stack<String>();
		
		
		st.push("Java");
		st.push("Php");
		st.push("anroid");
		st.push("SQL");
		
		for(String s : st)
		{
			System.out.println(s);
		}
		
		System.out.println("***********");
		System.out.println(st.pop());
		System.out.println("************");

		for(String s : st)
		{
			System.out.println(s);
		}
		
		System.out.println("*************");
		
		System.out.println(st.peek());
		
		System.out.println("************");

		for(String s : st)
		{
			System.out.println(s);
		}
	}
}
