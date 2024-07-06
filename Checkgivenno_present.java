package basics.java.part2;

public class Checkgivenno_present 
{

	public static void main(String[] args) 
	{
		int rollno[]= {12,56,77,15,89};
		
		int no_to_check=15;
		for(int i=0;i<rollno.length;i++)
		{
			if(no_to_check==rollno[i])
			{
				System.out.println("15 is present in the given Array ");
				System.out.println("And it's indexing is:"+i);
			}
			
		}
		
	}

}
