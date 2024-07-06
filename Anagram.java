package basics.java.part2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) 
	{
		String s1="inch";
		String s2="chin";
		
		if(s1.length()!=s2.length())
		{
			System.out.println("It's not an anagram");
		}
		else
		{
			System.out.println("Eligible to become anagram but need to see...");
			
			char c1[]=s1.toCharArray();
			char c2[]=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			
			boolean myfinalanswer=Arrays.equals(c1, c2);
			if(myfinalanswer==true)
			{
				System.out.println("The given 2 Strings are Anagram");
			}
			else
			{
				System.out.println("The given 2 Strings are not Anagram");
			}
		}
	}

}
