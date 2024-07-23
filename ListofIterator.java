package basis.java.part3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListofIterator {

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add("Sansu");
		a1.add("Toshu");
		a1.add("Riya");
		a1.add("Soni");
		a1.add("Ram");
		System.out.println(a1);
		Iterator i1=a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("********************");
		//forward direction
		ListIterator i2= a1.listIterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		System.out.println("********************");
		//backward direction
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
		}

}
