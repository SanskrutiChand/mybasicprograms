package basics.java.part2;

//super calling
class Set_URL
{
	Set_URL(int age)
	{
		System.out.println("Set URL");
	}
}
class Launch_browser extends Set_URL
{
	
	Launch_browser(String Chat)
	{
		super (9);
		System.out.println("Launch_the browser");
	}
}
public class Super_testcase extends Launch_browser
{
	Super_testcase()
	{
		super("Sanskruti");
		System.out.println("Testcase 1");
	}
	
	public static void main(String[] args) 
	{
		Super_testcase s1=new Super_testcase();
		
	}

}
