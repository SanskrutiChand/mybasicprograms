package basis.java.part3;

public class This_Keyword 
{
	int age;
	String name;
	double salary;
	void student_details(int age, String name, double salary)
	{
	this.age=age;     //local to global
	this.name=name;
	this.salary=salary;
	}
	public static void main(String[] args) 
	{
		This_Keyword t1=new This_Keyword();
		t1.student_details(22,"Riya",67890);
		System.out.println(t1.age);
		System.out.println(t1.name);
		System.out.println(t1.salary);
		
		
	}

}
