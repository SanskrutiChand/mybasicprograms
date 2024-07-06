package basics.java.part2;

public class String_UppercaseLowercase {  //to uppper-case, to lower-case

	public static void main(String[] args) 
	{
		String name="SANSU";
		int length_of_string=name.length();     //length of the string
		System.out.println(length_of_string);
		
		String s1= name.toLowerCase();
		System.out.println(s1);
	
		String s2="i live in india";
		int length=s2.length();        //length of the string
		System.out.println(length);
		
		String s3=s2.toUpperCase();
		System.out.println(s3);
		
	}

}
