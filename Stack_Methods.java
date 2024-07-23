package basis.java.part3;

import java.util.Stack;

public class Stack_Methods {

	public static void main(String[] args) 
	{
		Stack<String >s1=new Stack();
		s1.add("5");
		s1.add("10");
		s1.add("15");
		s1.add("20");
		s1.add("25");
		s1.add("30");
		s1.add("35");
		s1.add("40");
		System.out.println(s1);
		
		s1.pop();
		System.out.println("Popped the element-"+s1);
		s1.peek();
		System.out.println("Peeked the element-"+s1);
		System.out.println("Push the element-"+s1.push("45"));
		System.out.println(s1);
		System.out.println("Search the element-"+s1.search("20"));
		
	}

}
