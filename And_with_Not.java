package basics.java;

public class And_with_Not 
{
	public static void main(String[] args)
	{
	     int age=20;
	     int salary=27000;
	     
	     if(!(age==18 && salary==30000)) //true
	     {
	    	 System.out.println("not operator will reverse the output");
	     }
	     if (!(age==20 && salary==50000)) //true
	     {
	    	 System.out.println("not operator will reverse the output");
	     }
	     if(!(age==50 && salary==27000)) //true
	     {
	    	 System.out.println("not operator will reverse the output");
	     }
	     if(!(age==20 && salary==27000)) //false
	     {
	    	 System.out.println("not operator will reverse the output");
	     }

	}   
}
