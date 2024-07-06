package basics.java.part2;

//interface always implements property of other class
interface Property
{
	void login_with_email_id();
	void login_with_mobile_no();
}
public class Inherit_Interface implements Property
{
	@Override
	public void login_with_email_id() 
	{
		System.out.print("Login can be done by both the ways ");
	}

	@Override
	public void login_with_mobile_no() 
	{
		System.out.println("email id and with mobile no");
	}

	public static void main(String[] args) 
	{
		new Inherit_Interface().login_with_email_id();
		new Inherit_Interface().login_with_mobile_no();
	}

	

}
