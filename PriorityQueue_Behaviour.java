package basis.java.part3;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_Behaviour {

	public static void main(String[] args) 
	{
		Queue q=new PriorityQueue();
		
		//check indexing
		q.add(21);
		q.add(14);
		q.add(98);
		q.add(18);
		q.add(29);
		System.out.println("Checking indexing-"+q);
		
		//sorting
		/*Collections.sort(q);
		System.out.println("Checking sorting-"+q);*/
		
		//check duplicate
		q.add(14);
		q.add(14);
		System.out.println("Checking duplicate values-"+q);
		
		//check null
		q.add(null);
		q.add(null);
		System.out.println("Checking null value-"+q);
		
		//check heterogeneous 
		q.add("Sansu");
		q.add("Kashmir");
		System.out.println("Checking heterogeneous value-"+q);
				
		
	}

}
