package basis.java.part3;

public class Narrowing 
{
	//Converting double into int

	public static void main(String[] args) 
	{
		//narrowing can be done explicitly
		int a1=(int)56.85;
		System.out.println(a1);
		
		double wt=(int)78.7682;
		int d=(int)wt;
		System.out.println(d);
		
	}

}
