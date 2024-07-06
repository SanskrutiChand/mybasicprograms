package basics.java.part2;

public class Average_value {

	//static int sum=0;
	//static double avg=0;
	public static void main(String[] args) 
	{
		int no[]=new int[4];
		no[0]=77;
		no[1]=78;
		no[2]=15;
		no[3]=9;
		
		double sum=0;
		double avg=0;
		
		for(int i=0;i<no.length;i++)
		{
			sum=sum+no[i];
		}
		System.out.println("The addition of the 4 numbers in array:"+sum);

		avg=sum/no.length;
		System.out.println("The average of 4 numbers:"+avg);
	}

}
