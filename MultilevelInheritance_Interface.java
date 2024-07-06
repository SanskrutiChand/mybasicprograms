package basics.java.part2;

interface Email
{
	void email_id();
}
interface Mobile_no
{
	void mobile_no();
}

public class MultilevelInheritance_Interface implements Email, Mobile_no
{
	@Override
	public void mobile_no() 
	{
		System.out.print("Facebook can be login ");
	}

	@Override
	public void email_id() 
	{
		System.out.println("with email id and with mobile no. too");
	}

	public static void main(String[] args) 
	{
		new MultilevelInheritance_Interface().mobile_no();
		new MultilevelInheritance_Interface().email_id();

	}

}
