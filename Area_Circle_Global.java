package basics.java;

public class Area_Circle_Global 
{
	static double pi=3.14;
			
    static void area()
	{
	int r=7;
	double area=pi*r*r;
	System.out.println(area);
	}
	
public static void main(String[] args)
{
	int r=10;
	double area=pi*r*r;
	System.out.println(area);
	area();
}	

}
