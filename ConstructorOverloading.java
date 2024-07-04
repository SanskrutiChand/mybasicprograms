package basics.java;

public class ConstructorOverloading 
{
	ConstructorOverloading(int a) //1 parameter
	{
		System.out.println("Int is a datatype");
	}
	ConstructorOverloading() //0 parameter
	{
		System.out.println("India is a beautiful country");
	}
	ConstructorOverloading(boolean a) //1 parameter
	{
		System.out.println("Boolean means 0,1");
	}
	ConstructorOverloading(char a, int b) //2 parameter
	{
		System.out.println("Charater and 0-10");
	}
	
	public static void main(String[] args) 
	{
		ConstructorOverloading c1=new ConstructorOverloading(6);
		ConstructorOverloading c2=new ConstructorOverloading();
		ConstructorOverloading c3=new ConstructorOverloading(true);
		ConstructorOverloading c4=new ConstructorOverloading('A',8);
	}

	

}
