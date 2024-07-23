package basis.java.part3;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Behaviour {

	public static void main(String[] args) 
	{
		//Upcasting TreeSet to Set
		Set<Integer>s1=new TreeSet<>();
		
		//check indexing
		s1.add(21);
		s1.add(14);
		s1.add(44);
		s1.add(18);
		s1.add(29);
		System.out.println("Checking indexing-"+s1);
		
		//check sorting
		/*Collections.sort(s1);
		System.out.println("Checking sorting-"+s1);*/

		//check duplicate
		s1.add(14);
		s1.add(14);
		System.out.println("Checking duplicate values-"+s1);
		
		//check null
		s1.add(null);
		s1.add(null);
		System.out.println("Checking null value-"+s1);
		
		//heterogeneous value
		/*s1.add("SANSU");
		s1.add("Testing");
		System.out.println("Checking heterogeneous value-"+s1);*/

	}

}
