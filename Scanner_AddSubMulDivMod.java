package basics.java;

import java.util.Scanner;

public class Scanner_AddSubMulDivMod 
{
	static void add()
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the value of a:");
		int a=s1.nextInt();
		System.out.println("Enter the value of b:");
		int b=s1.nextInt();
		int sum=a+b;
		System.out.println("Addition of a and b:"+sum);
	}
	void sub()
	{
		Scanner s1=new Scanner(System.in);

		System.out.println("Enter the value of a:");
		int c=s1.nextInt();
		System.out.println("Enter the value of b:");
		int d=s1.nextInt();
		int sub=c-d;
		System.out.println("Subtraction of c and d:"+sub);
	}
	static void mul()
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the value of e:");
		double e=s1.nextDouble();
		System.out.println("Enter the value of f:");
		double f=s1.nextDouble();
		double mul=e*f;
		System.out.println("Multiplication of e and f:"+mul);
	}
	void div()
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the value of g:");
		float g=s1.nextFloat();
		System.out.println("Enter the value of h:");
		float h=s1.nextFloat();
		float div=g/h;
		System.out.println("Division of g and h:"+div);
	}
	static void mod()
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the value of i:");
		double i=s1.nextDouble();
		System.out.println("Enter the value of j:");
		double j=s1.nextDouble();
		double mod=i%j;
		System.out.println("Modulas of i and j:"+mod);
	}
	
	public static void main(String[] args)
	{
		add();
		Scanner_AddSubMulDivMod s1=new Scanner_AddSubMulDivMod();
		s1.sub();
		mul();
		s1.div();
		mod();
	}

}
