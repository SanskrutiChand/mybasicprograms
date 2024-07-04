package basics.java;

public class NonStaticMethod 
{
   void add()
   {
	   int no1=5;
	   int no2=10;
	   int add=no1+no2;
	   System.out.println(add);
	}   
   void sub()
   {
	   int no1=9;
	   int no2=3;
	   int sub=no1-no2;
	   System.out.println(sub);
   }
   public static void main(String[] args) 
   {
	   NonStaticMethod n1=new NonStaticMethod();
	   n1.add();
	   n1.sub();
	  
}
}
