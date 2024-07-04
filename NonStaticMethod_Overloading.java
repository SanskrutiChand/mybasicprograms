package basics.java;

public class NonStaticMethod_Overloading 
{
	void add(double a) //1 parameter
	{
		double sum=6+a;
		System.out.println(sum);
	}
	void add(int a, int b) //2 parameter
	{
		int sum=a+b+6;
		System.out.println(sum);
	}
	void add() //0 parameter
	{
		System.out.println("Without Parameter");
	}
	public static void main(String[] args)
	{
		NonStaticMethod_Overloading n1=new NonStaticMethod_Overloading();
		n1.add(9.73);
		n1.add(8,4);
		n1.add();
	}
	
	
	
	

}
