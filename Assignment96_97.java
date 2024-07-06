package basics.java.part2;

public class Assignment96_97 
{

	public static void main(String[] args) 
	{
		//check in the given String 'n' is present in the middle or not
		String s="automation testing";
		boolean output=s.matches("(.*)n(.*)");
		System.out.println("In a given String 'automation testing' the letter 'n' is present in the middle of the string or not: "+output);
		
		//check String starts with 's' and ends with'h' and four letters in b/w
		String s1="sketch";
		boolean b=s1.matches("s....h");
		System.out.println("In the given String 'sketch' there are four letters in between: "+b);
		boolean b1=s1.matches("s(.*)h");
		System.out.println("First letter is 's'  and last letter is 'h':"+b1);

	}

}
