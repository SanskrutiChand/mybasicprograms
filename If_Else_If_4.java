package basics.java;

public class If_Else_If_4 
{
	public static void main(String[] args) 
	{
		int no1=10;
		int no2=40;
		int no3=60;
		int no4=45;
		
		if(no1>no2) //false
		{
			System.out.println("1");
	    }
		     else if(no2>no3) //false
		     {
			  System.out.println("2");
		     }
		     else if(no3<no4) //false
		     {
			  System.out.println("3");
		     }
		     else if(no4<no1) //false
		     {
			  System.out.println("4");
		     }
		else
		{
			System.out.println("5");
		}
		
	}
	
}
