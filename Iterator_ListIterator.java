package basis.java.part3;

import java.util.LinkedList;
import java.util.ListIterator;

public class Iterator_ListIterator {

	public static void main(String[] args) 
	{
      LinkedList l1=new LinkedList();
		
		l1.add("Riya");
		l1.add("Sansu");
		l1.add("Jay");
		l1.add("Ram");
		l1.add("Mona");
		System.out.println(l1);
		
		System.out.println("Using list iterator forward traversing");
		ListIterator  i2 = l1.listIterator();		
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		System.out.println("Using list iterator backward traversing");
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
		
		
	}

}
