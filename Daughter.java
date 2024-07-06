package basics.java.part2;

//multilevel inheritance
class Grandmother
{
	static void mom()
	{
		System.out.println("I am my mother of my daughter and a grandmother of my daughter's girl");
	}
	
}
class Mother extends Grandmother
{
	static void lil()
	{
		System.out.println("I am mother my daughter and a daughter of my mother");
	}
	
}
public class Daughter extends Mother
{
	void add()
	{
		System.out.println("I am the daughter of my mother");
	}
	
	public static void main(String[] args)
	{
		mom();
		lil();
		Daughter d1=new Daughter();
		d1.add();
		
	}
	

}

