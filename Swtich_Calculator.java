package basics.java.part2;

import java.util.Scanner;

public class Swtich_Calculator 

{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.print("Enter the value of a:");
		double a=s1.nextDouble();
		
		System.out.print("Enter the value of b:");
		double b=s1.nextDouble();
		
		System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice: ");
        
        int choice = s1.nextInt();
        double sum;
        double sub;
        double mul;
        double div;
        
        switch(choice) 
        {
        case 1:
            sum = a+b;
            System.out.println("Result of addition: " + sum);
            break;
        case 2:
        	sub = a-b;
            System.out.println("Result of subtraction: " + sub);
            break;
        case 3:
            mul = a*b;
            System.out.println("Result of multiplication: " + mul);
            break;
        case 4:
            div=a/b;
            System.out.println("Result of division: " + div);
            default:
                System.out.println("Invalid choice!");
        }
	}

}
