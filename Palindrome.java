package basics.java.part2;

public class Palindrome {

	public static void main(String[] args) 
	{
		String name1="RADAR";
		String input= name1.toLowerCase();
		String reverse="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char c=input.charAt(i);
			reverse=reverse+c;
		}
		System.out.println(reverse);
		
		boolean result=input.equals(reverse);
		System.out.println(result);
		
		if(result)
		{
			System.out.println("it is a palindrome");
		}
		else
		{
			System.out.println("it is not palindrome");
		}
	}

}
