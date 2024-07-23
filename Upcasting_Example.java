package basis.java.part3;

class Upcasting_Example_2
{
	void name()
	{
		System.out.println("sansu");
	}
	void rollno()
	{
		System.out.println(47);
	}
}
public class Upcasting_Example extends Upcasting_Example_2
{
	/*void add()
	{
		System.out.println("sansu47");
	}*/
	public static void main(String[] args) 
	{
		Upcasting_Example_2 u1=new Upcasting_Example();
		u1.name();
		u1.rollno();
		
       /* Upcasting_Example u2 = new Upcasting_Example();
        u2.add();*/

		
	}

}
