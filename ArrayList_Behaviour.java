package basis.java.part3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_Behaviour {

	public static void main(String[] args) 
	{
		//Upcasting ArrayList to List
		List l1=new ArrayList();
		
		//check indexing
		l1.add(90);
		l1.add(60);
		//l1.add("Sansu");
		l1.add(20);
		l1.add(65);
		System.out.println("Checking indexing-"+l1);
		
		//check sorting
		Collections.sort(l1);
		System.out.println("Checking sorting-"+l1);
		
		//check duplicate
		l1.add(60);
		l1.add(60);
		System.out.println("Checking duplicate values-"+l1);
		
		//check null
		l1.add(null);
		l1.add(null);
		System.out.println("Checking null values-"+l1);
		
		//heterogeneous value
		l1.add("Sansu");
		l1.add("Kashmir");
		System.out.println("Checking heterogeneous value-"+l1);
		
		
		
		
	}

}
