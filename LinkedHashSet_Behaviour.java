package basis.java.part3;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_Behaviour {

	public static void main(String[] args) 
	{
		Set s=new LinkedHashSet();
		
		//check indexing
		s.add(21);
		s.add(14);
		s.add(145);
		s.add(18);
		s.add(29);
		System.out.println("Checking indexing-"+s);
		
		//sorting
		/*Collections.sort(s);
		System.out.println("Checking sorting-"+s);*/
		
		//check duplicate
		s.add(14);
		s.add(14);
		System.out.println("Checking duplicate values-"+s);
		
		//check null
		s.add(null);
		s.add(null);
		System.out.println("Checking null value-"+s);
		
		//check heterogeneous 
		s.add("India");
		s.add("Won");
		System.out.println("Checking heterogeneous value-"+s);
		
	}

}
