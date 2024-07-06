package basics.java.part2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock_keyword {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		try
		{
		System.out.print("Enter your age: ");
		int age=s1.nextInt();
		System.out.println(age);
		}
		catch(InputMismatchException a1)
		{
			System.out.println("Hey, age must be valid numeric value, please enter again");
			Scanner s2=new Scanner(System.in);
			int age1=s2.nextInt();
		}
		finally
		{
			System.out.println("No matter what but I will always get executed");
		}
		System.out.print("Please enter your name: ");
		Scanner s3=new Scanner(System.in);
		String name=s3.next();
	}

}
