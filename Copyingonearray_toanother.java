package basics.java.part2;

import java.util.Arrays;

public class Copyingonearray_toanother {

	public static void main(String[] args) 
	{
		int rollno[]=new int[5];
		rollno[0]=10;
		rollno[1]=13;
		rollno[2]=14;
		rollno[3]=15;
		rollno[4]=90;
				
		int rollno_copied[]=new int [rollno.length];
		for(int i=0;i<rollno.length;i++)
		{
			rollno_copied[i]=rollno[i];
		}
		System.out.println(Arrays.toString(rollno));
		System.out.println(Arrays.toString(rollno_copied));
		
		if (Arrays.equals(rollno,rollno_copied))
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
		boolean output= Arrays.equals(rollno, rollno_copied);
		if(output==true)
		{
			System.out.println("Copied array values are equals to each other");
		}
		else
		{
			System.out.println("Copied array values are equals to each other");
		}

	}
	
}

				
				
					
		



