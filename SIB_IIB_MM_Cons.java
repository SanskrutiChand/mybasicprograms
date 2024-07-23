package basis.java.part3;

public class SIB_IIB_MM_Cons 
{
	static
	{
		System.out.println("SIB");
	}
	SIB_IIB_MM_Cons()
	{
		System.out.println("Constructor");
	}
	{
		System.out.println("IIB");
	}
	

	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		new SIB_IIB_MM_Cons();
		new SIB_IIB_MM_Cons();
	}

}
