package basics.java.part2;

public class Thread_sleep 
{

	public static void main(String[] args) throws NullPointerException, InterruptedException
	{
		System.out.println("Sanskruti");
		Thread.sleep(3000);
		System.out.println("Chand");
		Thread.sleep(5000);
		
		throw new NullPointerException("Sorry");
		
	}

}
