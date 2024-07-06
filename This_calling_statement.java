package basics.java.part2;

public class This_calling_statement 
{
	This_calling_statement(int a)
	{
	System.out.println("1");
	}
	This_calling_statement(int a,int b)
	{
		this(9);
		System.out.println("2");
	}
	This_calling_statement(int a,double b)
	{
		this(56,8);
		System.out.println("3");
	}
	
	public static void main(String[] args)
	{
		new This_calling_statement(17,5.67);
		
	}
}
