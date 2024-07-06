package basics.java.part2;

abstract class Command_prompt  //abstract class
{
	abstract void add();  //abstract method
}
public class Windows_Laptops extends Command_prompt  //concrete class
{
	void add() 
	{
		System.out.println("Real implemenation will be here");
	}

	public static void main(String[] args)  //concrete method
	{
		new Windows_Laptops().add();

	}
	

}
