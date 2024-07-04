package basics.java;

public class Or_Operator 
{
public static void main(String[] args) 
{
	String m="mom";
	int num2=20;
	
	if(m=="daughter" || num2==20) //true
	{
		System.out.println("when both condition are false it will not execute");
	}
	if(m=="mom" || num2==30) //true
	{
		System.out.println("when both condition are false it will not execute");
	}
	if(m=="son" || num2==20) //true
	{
		System.out.println("when both condition are false it will not execute");
	}
	if(m=="mom || num2==20") //false
	{
		System.out.println("when both condition are false it will not execute");
	}
	
	
}
}
