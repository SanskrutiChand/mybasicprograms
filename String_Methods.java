package basics.java.part2;

public class String_Methods {

	public static void main(String[] args) 
	{
		//charAt(index)
		String s="I love my INDIA";
		 char first_char=s.charAt(11);
		 System.out.println(first_char);
		 
		 //indexOfChar(")
		int i= s.indexOf("m");
		System.out.println(i);
		
		//trim
		String trimmed =s.trim();
		System.out.println(trimmed);
		
		String s1="   hey, Sansu   ";
		System.out.println(s1);
		System.out.println(s1.trim());
		
		//subString with single para
		String s2="Hello Neelam Chand";
		String s3= s2.substring(5);
		System.out.println(s3);
		
		//subString with double para
		String s4=s2.substring(6, 12);
		System.out.println(s4);
	}

}
