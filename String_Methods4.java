package basics.java.part2;

public class String_Methods4 {

	public static void main(String[] args) 
	{
		//equalsIgnoreCase
		String s="software";
		boolean b=s.equalsIgnoreCase("Software");
		System.out.println("equalsIgnoreCase: "+b);
		//isEmpty
		String s1="";
		System.out.println("isEmpty: "+s1.isEmpty());
		//endsWith
		System.out.println("endsWith: "+s.endsWith("e"));
		//repeat
		System.out.println("repeat 5 times: "+s.repeat(5));
	}

}
