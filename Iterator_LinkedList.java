package basis.java.part3;

import java.util.Iterator;
import java.util.LinkedList;

public class Iterator_LinkedList {

	public static void main(String[] args) 
	{
       LinkedList l1=new LinkedList();
		
		l1.add("Riya");
		l1.add("Sansu");
		l1.add("Jay");
		l1.add("Ram");
		l1.add("Mona");
		System.out.println(l1);
		
		Iterator i1= l1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}

}
