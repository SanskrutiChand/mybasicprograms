package basis.java.part3;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_while {

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add("Sansu");
		a1.add("Toshu");
		a1.add("Riya");
		a1.add("Soni");
		System.out.println(a1);
		Iterator i1=a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
