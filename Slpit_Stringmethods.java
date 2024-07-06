package basics.java.part2;

import java.util.Arrays;

public class Slpit_Stringmethods {

	public static void main(String[] args) 
	{
		//with one parameter
		String s="my name is sansu";
		String s1[]=s.split(" ");
		//System.out.println(s1[2]);
		System.out.println(Arrays.toString(s1));
		
		//with two parameter
		String s2[]=s.split(" ", 2);
		System.out.println(Arrays.toString(s2));
		
	}

}
