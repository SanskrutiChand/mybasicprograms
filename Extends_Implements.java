package basics.java.part2;

interface Male
{
	void boys_cllg();
	
}
class Female     //superclass
{
	void girls_cllg()
	{
		System.out.println("Software Testing");
	}
}
class Human extends Female implements Male    //subclass
{
	@Override
	public void boys_cllg() 
	{
		System.out.println("Studying...");
	}
	
}
public class Extends_Implements {

	public static void main(String[] args) 
	{
		Human h1=new Human();
		h1.boys_cllg();  //calling method from interface
		h1.girls_cllg();  //calling method from superclass
	}

}
