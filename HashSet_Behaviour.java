package basis.java.part3;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSet_Behaviour {

	public static void main(String[] args) 
	{
		Set s=new HashSet();
		
		//check indexing
		s.add(21);
		s.add(14);
		s.add(98);
		s.add(18);
		s.add(29);
		System.out.println("Checking indexing-"+s);
		
		//check sorting
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
		
		//heterogeneous value
		s.add("Sansu");
		s.add("Kashmir");
		System.out.println("Checking heterogeneous value-"+s);
		
		
	}

}
