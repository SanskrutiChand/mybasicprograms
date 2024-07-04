package basics.java;

public class Nested_If_Else 
{

	public static void main(String[] args) 
	{
		int no1=20;
		int no2=50;
		
		if(no1<no2) //true
		{
			  if(no1>100) //false
			  {
				System.out.println("1");
			  }
			  else
			  {
				System.out.println("2");
			  }
		}
		else
		{
		  System.out.println("3");	
		}
		
	}
}
