package basics.java.part2;

//Method Overloading
public class Overloadingmainmethod {

	public static void main() 
	{
		System.out.println("Inside main wothout parameters");
	}
	public static void main(String Your_name)
	{
		System.out.println("Inside main with String parameter: "+Your_name);
	}
	public static void main(double salary)
	{
		System.out.println("Inside main with double parameter: "+salary);
	}
	public static void main(String[] args) 
	{
		main();
		main("Sansu");
		main(5.6);
	}

}
