package basics.java.part2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Info_TryCatch 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
		try                                                     //multiple try
		{
			System.out.print("Enter your age: ");
			int age=s1.nextInt();
			System.out.println("Confirming your age "+age);
			
			System.out.print("Enter your salary: ");
			double salary=s1.nextDouble();
			System.out.println("Confirming your salary "+salary);
			
			System.out.print("Enter your weight:");
			float weight=s1.nextFloat();
			System.out.println("Confirming your weight "+weight);
			
			System.out.print("Are you a student? Say True or False: ");
			boolean b=s1.nextBoolean();
			System.out.println("Confirming student or not- "+b);
		}
		catch(InputMismatchException a1)                        //single catch block
		{
			System.out.println("Please fill the form again");
		}
		
	}

}
