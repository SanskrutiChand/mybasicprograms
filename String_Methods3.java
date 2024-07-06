package basics.java.part2;

public class String_Methods3 {

	public static void main(String[] args) 
	{
		String name="Sanskruti";
		//remove a from given String
		String name1=name.replaceAll("a", "");
		System.out.println(name1);
		
		//replace 'a' with 'r'
		String name2=name.replaceAll("a", "r");
		System.out.println(name2);
		
		//in a given String remove all space
		String s="my name is sansu";
		System.out.println(s.replaceAll(" ", ""));
		
		//in the given String remove all capital and small letters
		String s1="SansKruti";
		System.out.println(s1.replaceAll("[A-Z]", ""));
		System.out.println(s1.replaceAll("[a-z]", ""));
		
		//in the given String remove all numeric values
		String s2="my rollno is 45";
		System.out.println(s2.replaceAll("[0-99]", ""));
		
	}
	

}
