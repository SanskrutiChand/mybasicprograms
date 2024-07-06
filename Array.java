package basics.java.part2;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) 
	{
		//program to store 5 values together
		int rollno[]=new int[5];
		rollno[0]=21;
		rollno[1]=24;
		rollno[2]=32;
		rollno[3]=54;
		rollno[4]=15;	
		
		for(int i=0;i<=4;i++)
		{
		//System.out.println(rollno[i]);
		}
		System.out.println(Arrays.toString(rollno));

		
		//program to store 5 names together
		String name[]=new String[5];
		name[0]="shanu";
		name[1]="neelu";
		name[2]="manu";
		name[3]="raju";
		name[4]="priya";
		System.out.println(Arrays.toString(name));

	}

}
