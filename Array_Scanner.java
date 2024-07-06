package basics.java.part2;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Scanner {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter any 5 values:");
		int values[]=new int[5];
		for(int i=0;i<5;i++)
		{
		   values[i] =s1.nextInt();
		}
		   System.out.println(Arrays.toString(values));


		System.out.println("Entered values are:");
		for(int i=0;i<5;i++)
		{
			System.out.println("value"+(i+1)+":"+values[i]);

		}

	}

}
