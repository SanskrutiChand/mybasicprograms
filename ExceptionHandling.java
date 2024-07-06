package basics.java.part2;

public class ExceptionHandling 
{

	public static void main(String[] args) 
	{
		try
		{
		int a=1/0;  //b from parent class and c from grand-parent class
		}
		catch(ArithmeticException a1)
		{
		System.out.println("handled the exception");
		}
		
	}
	

}
