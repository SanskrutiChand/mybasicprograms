package basics.java.part2;

import java.util.Arrays;

public class String_Methods2 
{
	public static void main(String[] args) 
	{
		String name="i am sanskruti chand";
		//to find particular word from the given String
		boolean answer=name.contains("am");
		System.out.println(answer);
		//to find suffix 
		boolean answer1=name.endsWith("chand");
		System.out.println(answer1);
		
		//to write in array
		String s1="manual";
		char c1[]=s1.toCharArray();
		System.out.println(Arrays.toString(c1));
	}

}
