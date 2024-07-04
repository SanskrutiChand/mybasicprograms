package basics.java;

public class Updating_GlobalVariable 
{
	int age=40;
	static String name="Riya";
	public static void main(String[] args)
	{
		name="Twinkle";
		System.out.println(name);
		
		Updating_GlobalVariable u1=new Updating_GlobalVariable();
		System.out.println(u1.age);
		System.out.println(u1.age=20);
	}

}
