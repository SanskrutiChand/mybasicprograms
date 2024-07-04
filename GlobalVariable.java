package basics.java;

public class GlobalVariable 
{
	int age=30;  //non-static
	static double salary =70837.78;  //static
	
	static void add()  //static
	{
		System.out.println("0");
	}
	
public static void main(String[] args) 
{
	System.out.println(salary);
	GlobalVariable g1=new GlobalVariable();
	System.out.println(g1.age);
	add();
}

}
