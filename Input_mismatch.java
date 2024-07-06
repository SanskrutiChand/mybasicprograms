package basics.java.part2;

//Input Mismatch Exception
import java.util.Scanner;

public class Input_mismatch 
{
	public static void main(String[] args)
	{
		Scanner s1=new 	Scanner(System.in);
		
		int age= s1.nextInt();
		short no= s1.nextShort();
		long b= s1.nextLong();
		byte digit= s1.nextByte();
		boolean a= s1.nextBoolean();
		float c= s1.nextFloat();
		double salary= s1.nextDouble();
		String name= s1.next();
	}

}
