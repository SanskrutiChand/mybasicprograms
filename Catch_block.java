package basics.java.part2;

import java.util.IllegalFormatException;
import java.util.InputMismatchException;

public class Catch_block 
{

	public static void main(String[] args) 
	{
		int rollno[]=new int [3];
		rollno[0]=15;  //tina
		rollno[1]=19;  //ram
		rollno[2]=20;  //rina
	try                                                        //single try block
	{
	    rollno[3]=40;  //sansu
	}
	catch(ArrayIndexOutOfBoundsException a1)                   //with multiple catch block
	{
		System.out.println("you exceeded the size");
	}
	catch(NullPointerException n1)
	{
		System.out.println("handled the exception called NPE");
	}
	catch(InputMismatchException i1)
	{
		System.out.println("handled the exception called IME");
	}
	catch(IllegalFormatException i2)
	{
		System.out.println("handled the exception called IFE");
	}
	
	}
}
