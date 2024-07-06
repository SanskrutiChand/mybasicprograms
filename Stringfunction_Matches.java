package basics.java.part2;

public class Stringfunction_Matches {

	public static void main(String[] args) 
	{
		//in the given String check exact four letters in it or not
		String s="rama";
		boolean b=s.matches("....");
		System.out.println(b);
		
		//check if given String ends with'a'
		String s1="karma";
		System.out.println((s1.matches("(.*)a")));
		
		//check String starts with 'k'
		System.out.println((s1.matches("k(.*)")));
		
		//check whether 'm,z,u' is present or not
		System.out.println((s1.matches("(.*)m(.*)")));
		System.out.println((s1.matches("(.*)z(.*)")));
		System.out.println((s1.matches("(.*)u(.)")));
		
		//check in the given String 'r' is present in the second place or not
		String s2="Grand";
		System.out.println(s2.matches(".r(.*)"));
	}

}
