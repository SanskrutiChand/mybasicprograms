package basics.java.part2;

//Method Overriding
class Method_parent
{
	void login()
	{
		System.out.println("Login with mobile no.");
	}
}
public class Method_overriding extends Method_parent
{
	void login()
	{
		/*super.login(); */
		System.out.println("Login with email-id");
		
	}
	public static void main(String[] args)
	{
		Method_overriding m1=new Method_overriding();
		m1.login();
	}


}
