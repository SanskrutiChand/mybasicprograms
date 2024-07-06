package basics.java.part2;

//switch case
import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Choose which browser to launch");
		System.out.println("1 for Firefox, 2 for Chrome, 3 for Safari, 4 for Edge");
		int a=s1.nextInt();

		switch(a)
		{
		case 1:
			System.out.println("Launching FrireFox Browser");
			break;
		case 2:
			System.out.println("Launching Chrome Browser");
			break;
		case 3:
			System.out.println("Launching Safari Browser");
			break;
		case 4:
			System.out.println("Launching Edge Browser");
			break;
			default:
				System.out.println("Invalid Browser");
				
			
		}
		
	}

}
