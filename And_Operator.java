package basics.java;

public class And_Operator 
{
public static void main(String[] args)
{
     int age=20;
     int salary=27000;
     
     if(age==18 && salary==30000) //false
     {
    	 System.out.println("when both condition true are then only it would execute");
     }
     if (age==20 && salary==50000) //false
     {
    	 System.out.println("when both condition are true then only it would execute");
     }
     if(age==50 && salary==27000) //false
     {
    	 System.out.println("when both condition are true then only it would execute");
     }
     if(age==20 && salary==27000) //true
     {
    	 System.out.println("when both condition are true then only it would execute");
     }
    	 
	
}
}
