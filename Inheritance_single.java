package basics.java.part2;

//single inheritance
	class Parent
	{
		void add() 
		{
			int a=2;
			int b=7;
			int sum=a+b;
			System.out.println(sum);
		}
	}
public class Inheritance_single extends Parent
{
		static void sub()
		{
			int a=7;
			int b=9;
			int sub=a-b;
			System.out.println(sub);
		}
		public static void main(String[] args)
		{
			sub();
			Inheritance_single i1=new Inheritance_single();
			i1.add();
		}

}




