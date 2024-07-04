package basics.java;

import java.util.Scanner;

public class Scanner_circumference_circle 
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the radius of circle:");
		double r= s1.nextDouble();
		
		double circumference= 2*Math.PI*r;
		System.out.println("Circumference of circle: "+ circumference);

		
	}

}
