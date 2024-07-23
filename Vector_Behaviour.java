package basis.java.part3;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Vector_Behaviour {

	public static void main(String[] args) 
	{
		List l2=new Vector();
		
		//check indexing
		l2.add(90);
		l2.add(60);
		l2.add(55);
		l2.add(20);
		l2.add(65);
		System.out.println("Checking indexing-"+l2);
		
		//check sorting
		Collections.sort(l2);
		System.out.println("Checking sorting-"+l2);
		
		//check duplicate
		l2.add(60);
		l2.add(60);
		System.out.println("Checking duplicate values-"+l2);
		
		//check null
		l2.add(null);
		l2.add(null);
		System.out.println("Checking null values-"+l2);
		
		//heterogeneous value
		l2.add("Beautiful");
		l2.add("Kashmir");
		System.out.println("Checking heterogeneous value-"+l2);
		
		
	}

}
