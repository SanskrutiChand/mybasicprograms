package basics.java;
import java.util.Scanner;
public class Scanner_areaofrectangle 
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the lenght of the rectangle:");
		double length=s1.nextDouble();
		
		System.out.println("Enter the width of the rectangle:");
		double width=s1.nextDouble();
		
		double area=length*width;
		System.out.println("Area of rectangle: "+area);
		
	}

	
}
