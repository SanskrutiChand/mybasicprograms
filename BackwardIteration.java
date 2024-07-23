package basis.java.part3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class BackwardIteration {

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		System.out.println(a1);
		
		System.out.println("Backward Iteration");
		
		ListIterator i1=a1.listIterator();
		while(i1.hasPrevious())
		{
			System.out.println(i1.previous());
		}
		
	}

}
