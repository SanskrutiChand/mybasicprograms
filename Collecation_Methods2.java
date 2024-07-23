package basis.java.part3;

import java.util.ArrayList;

public class Collecation_Methods2 {

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add("Sansu");
		a1.add("Toshu");
		a1.add("Riya");
		a1.add("Soni");
		//size
		System.out.println("The size of a1:"+a1.size());
		System.out.println("Before removal:"+a1);
		
		//remove
		a1.remove("Riya");
		System.out.println("The size of after removing 1 object from a1:"+a1.size());
		System.out.println("After removal:"+a1);
		
		//removeAll
		ArrayList a2=new ArrayList();
		a2.addAll(a1);
		a2.add("Neelam");
		a2.removeAll(a1);
		System.out.println(a2);
		System.out.println(a2.size());
		
		//clear
		ArrayList a3=new ArrayList();
		a3.add("1");
		a3.add("90");
		a3.add("99");
		a3.add("89");
		a3.add("76");
		System.out.println("Before clearing:"+a3);
		a3.clear();
		System.out.println("After clearing:");
		
	}

}
