package basis.java.part3;

public class AssertKeywordInJava {

	public static void main(String[] args) 
	{
		/*String name="Toshu";
		assert name.length()>1; //condition is true
		System.out.println(name.concat(" Chand"));*/
		
		int a=10;
		int b=20;
		assert a>50: "sorry the condition went wrong";
		int sum=a+b;
		System.out.println(sum);
	}

}
