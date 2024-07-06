package basics.java.part2;

//super keyword
class Animal
{
	void sound()
	{
		System.out.println("Animal makes a sound");
	}
}
class Dog extends Animal
{
	void sound()
	{
		super.sound();
		System.out.println("Dog barks");
	}
}
public class Super_keyword 
{
	public static void main(String[] args)
	{
		Dog d1=new Dog();
		d1.sound();
	}

}
