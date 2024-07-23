package basis.java.part3;

import java.util.ArrayList;

public class ArrayList_Methods {

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add("Sansu");
		a1.add("Neelam");
		a1.add("Toshu");
		a1.add(32);
		a1.add("ram");
		System.out.println(a1);
		
		//indexOf()
		int i=a1.indexOf(32);
		System.out.println(i);
		
		//get()
		System.out.println(a1.get(2));
		
		//set()
		a1.set(1, "ram");
		System.out.println(a1);
		
	}

}
