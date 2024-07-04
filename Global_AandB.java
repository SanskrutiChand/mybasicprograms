
package basics.java;

public class Global_AandB 
{
	static int a=10;
	static int b=20;
	
	static void add()
	{
		int sum=a+b;
		System.out.println(sum);
	}
	static void sub() 
	{
		int sub=b-a;
		System.out.println(sub);
	}
	static void mul()
	{
		int mul=a*b;
		System.out.println(mul);
	}
	static void div()
	{
		int div=b/a;
		System.out.println(div);
	}
	static void mod()
	{
		int mod=a%b;
		System.out.println(mod);
	}
	
	public static void main(String[] args) 
	{
		Global_AandB g1=new Global_AandB();  //add
		System.out.println(g1.a+b);
		Global_AandB g2=new Global_AandB();  //sub
		System.out.println(g2.b-a);
		Global_AandB g3=new Global_AandB();  //mul
		System.out.println(g3.a*b);
		Global_AandB g4=new Global_AandB();  //div
		System.out.println(g4.b/a);
		Global_AandB g5=new Global_AandB();  //mod
		System.out.println(g5.a%b);
	}

}
