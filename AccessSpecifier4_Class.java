package basics.java.part2;

public class AccessSpecifier4_Class 
{
	public void add()
	{
		int a=3;
		int b=1;
		int sum=a+b;
		System.out.println(sum);
	}
	protected void sub()
	{
		int a=7;
		int b=4;
		int sub=a-b;
		System.out.println(sub);
	}
	private void mul()
	{
		double a=5.6;
		double b=4;
		double mul=a*b;
		System.out.println(mul);
	}
	void div()
	{
		double a=9.6;
		double b=3.2;
		double div=a/b;
		System.out.println(div);
	}
 public static void main(String[] args)
 {
	 AccessSpecifier4_Class m1=new AccessSpecifier4_Class();
	 m1.add();
	 m1.sub();
	 m1.mul();
	 m1.div();
	
}
}
