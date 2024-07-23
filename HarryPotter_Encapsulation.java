package basis.java.part3;

class Author   //auther:Sansu
{
	private int age=22;  //default
	
	public int getAge()  //to get the age
	{
		return age;
	}
	public void setAge(int age)  //to set the age
	{
		this.age= age;
	}
	private String un="sans@gmail.com";

	public String getUn() 
	{
		return un;
	}
	public void setUn(String un) 
	{
		this.un = un;
	}
	//private String pwd="asdfg";
}
	
	public class HarryPotter_Encapsulation   //Author Harry
	{	
  
	public static void main(String[] args) 
	{
		Author a1=new Author();
		a1.setAge(55);
		System.out.println(a1.getAge());
		a1.setUn("sanskurit.chand");
		System.out.println(a1.getUn());
	}

}


