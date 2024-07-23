package basis.java.part3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_Behaviour {

	public static void main(String[] args) 
	{
		List a1=new LinkedList();
		
		//check indexing
		a1.add(90);
		a1.add(60);
		a1.add(102);
		a1.add(20);
		a1.add(65);
		System.out.println("Checking indexing-"+a1);
		
		//check sorting
		Collections.sort(a1);
		System.out.println("Checking sorting-"+a1);
		
		//check duplicate
		a1.add(60);
		a1.add(60);
		System.out.println("Checking duplicate values-"+a1);
		
		//check null
		a1.add(null);
		a1.add(null);
		System.out.println("Checking null values-"+a1);
		
		//heterogeneous value
		a1.add("India");
		a1.add("Won");
		System.out.println("Checking heterogeneous value-"+a1);
	
		
	}

}
