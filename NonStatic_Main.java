package basics.java;

public class NonStatic_Main 
{
	public void add() 
	{
		System.out.println("Non-Static");
	}
	public static void main(String[] args)
	{
		NonStatic_Main n1=new NonStatic_Main();
		n1.add();
	}

}
