package basics.java.part2;
interface SuperInterface
{
	void method1();
	void method2();
}
abstract class AbstractClass implements SuperInterface
{
	abstract void method3();
	abstract void method4();
}
class Subclass extends AbstractClass
{

	@Override
	public void method1() 
	{
		System.out.println("Method 1 implementation in Subclass");
	}

	@Override
	public void method2() 
	{
		System.out.println("Method 2 implementation in Subclass");
	}

	@Override
	void method3() 
	{
		System.out.println("Method 3 implementation in Subclass");
	}

	@Override
	void method4() 
	{
		System.out.println("Method 4 implementation in Subclass");
	}
	
}
public class Interface 
{
	public static void main(String[] args)
	{
		new Subclass().method1();
		new Subclass().method2();
		new Subclass().method3();
		new Subclass().method4();
	}
	

}
