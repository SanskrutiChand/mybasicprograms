package basis.java.part3;

public class Return_Keyword 
{
	static int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	static double sub(double a,double b)
	{
		double sub=a-b;
		return sub;
	}

	public static void main(String[] args) 
	{
		System.out.println(add(78,68));
		System.out.println(sub(6.5,1.9));
	}

}
