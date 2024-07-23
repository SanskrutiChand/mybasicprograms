package basis.java.part3;

import java.util.LinkedList;

public class LinkedList_Methods {

	public static void main(String[] args) 
	{
		LinkedList l1=new LinkedList();
		
		l1.add("Riya");
		l1.add("Sansu");
		l1.add("Jay");
		l1.add("Ram");
		l1.add("Mona");
		System.out.println("Show all the names-"+l1);
		
		//l1.listIterator();
		//addFirst and addLast
		l1.addFirst("Raju");
		System.out.println("Add in the first-"+l1);
		l1.addLast("Veena");
		System.out.println("Add in the last-"+l1);
		
		//removeFirst and removeLast
		l1.removeFirst();
		System.out.println("Remove the first name-"+l1);
		l1.removeLast();
		System.out.println("Remove the last name-"+l1);
		
		l1.pollFirst();
		l1.pollLast();
		System.out.println(l1);
	}

}
