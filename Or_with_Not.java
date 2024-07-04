package basics.java;

public class Or_with_Not 
{
	public static void main(String[] args) 
	{
		String m="mom";
		int num2=20;
		
		if(!(m=="daughter" || num2==20)) //false
		{
			System.out.println("not operator will reverse the output");
		}
		if(!(m=="mom" || num2==30)) //false
		{
			System.out.println("not operator will reverse the output");
		}
		if(!(m=="son" || num2==20)) //false
		{
			System.out.println("not operator will reverse the output");
		}
		if(!(m=="mom || num2==20")) //true
		{
			System.out.println("not operator will reverse the output");
		}
	}
		
}
