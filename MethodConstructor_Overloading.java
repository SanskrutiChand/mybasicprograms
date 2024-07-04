package basics.java;

public class MethodConstructor_Overloading 
{
	static void add() //0 parameter
	{
		System.out.println("Default parameter");
	}
	void add(int a)  //1 parameter
	{
		int sum=a+2;
		System.out.println(sum);
	}
	void add(char a, int b)  //2 parameter
	{
		String sum=a+6+"s";
		System.out.println(sum);
	}
	MethodConstructor_Overloading(int a,int b, int c) //3 parameter
	{
		System.out.println("Integer a,b,c");
	}
	MethodConstructor_Overloading() //0 parameter
	{
		System.out.println("Parameter");
	}
	MethodConstructor_Overloading(String a) //1 parameter
	{
		System.out.println("String's S will always be capital");
	}
	
	public static void main(String[] args)
	{
		MethodConstructor_Overloading m1=new MethodConstructor_Overloading(4,2,6);
		MethodConstructor_Overloading m2=new MethodConstructor_Overloading();
		MethodConstructor_Overloading m3=new MethodConstructor_Overloading("Sanskruti");
		MethodConstructor_Overloading m4=new MethodConstructor_Overloading();
	    m4.add(6);
		m4.add('r',9);
		add();
		
	}

}
