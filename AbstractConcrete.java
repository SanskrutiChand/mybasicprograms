package basics.java.part2;

class ConcreteClass4 extends AbstractClass2
{
	void method4()  //concrete method4
	{
		System.out.println("Method4 implemented in ConcreteClass4");
	}

	void method2()  //concrete method2
	{
		System.out.println("Method2 implemented in ConcreteClass2");
	}
}
class ConcreteClass3 extends AbstractClass1
{

	@Override
	void method1() 
	{
		System.out.println("Method1 implemented in ConcreteClass3");
		
	}

}
abstract class AbstractClass1
{
	abstract void method1();
}
abstract class AbstractClass2 
{
	abstract void method2();
}
class ConcreteClass2 extends ConcreteClass4
{
	void method3()  //concrete method3
	{
		System.out.println("Method3 implemented in ConcreteClass1");
	}

}
class ConcreteClass1 extends ConcreteClass3
{
	void method1()  //concrete method1
	{
		System.out.println("Method1 implemented in ConcreteClass1");
	}

	void method3() 
	{
		System.out.println("Method3 implemented in ConcreteClass1");
		
	}
}


public class AbstractConcrete {

	public static void main(String[] args) 
	{
		new ConcreteClass1().method1();
		new ConcreteClass2().method2();
		new ConcreteClass1().method3();
		new ConcreteClass2().method4();

	}

}
