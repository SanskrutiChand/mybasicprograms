package basics.java;

public class MethodOverloading 
{
	static void add(int a) //1 parameter
	{
		int sum=a+6;
		System.out.println(sum);
	}
	static void add() //0 parameter
	{
		System.out.println("Function");
	}
	static void add(int a,char b) //2 parameter
	{
		String sum=a+1+"rs";
		System.out.println(sum);
	}
	static void add(double a,double b,double c) //4 parameter
	{
		double sum=a+b+c+6;
		System.out.println(sum);
	}
	
	public static void main(String[] args) 
	{
		add(200);
		add();
		add(10,'s');
		add(6.5,2.1,4.5);
	}

}
