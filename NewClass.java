package basics.java.part2;

//abstract class and method
abstract class NewClass_Two
{
	abstract void add();
	abstract void substract();
}
abstract class NewClass_One extends NewClass_Two
{
	abstract void add1();
	abstract void substract1();
}
public class NewClass extends NewClass_One
{
    static void mul()
    {
		System.out.println("Concrete static method");

    }
    void div()
    {
    	System.out.println("Concrete non-static method");
    }
	public static void main(String[] args) 
	{
		new NewClass().mul();
		new NewClass().div();
	}
	
	void add1() {

	}
	
	void substract1() {
		
	}
	
	void add() {
		
	}
	
	void substract() {
		
	}

}
