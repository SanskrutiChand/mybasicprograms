package basis.java.part3;

import java.util.ArrayList;

public class Collection_Methods {

	public static void main(String[] args) 
	{
		//add
		ArrayList a1=new ArrayList();
		a1.add("Sansu");
		a1.add("Neelam");
		a1.add("Toshu");
		a1.add(32);
		a1.add(78393949);
		a1.add("false");
		a1.add("Sansu");
		a1.add('s');
		a1.add(null);
		System.out.println(a1);
		
		//addAll
		ArrayList a2=new ArrayList();
		a2.addAll(a1);
		a2.add("Ram");
		System.out.println(a2);
		
		//contains, containsAll
		System.out.println(a2.contains("Ram"));
		System.out.println(a2.containsAll(a1));
		
		//isEmpty
		System.out.println(a2.isEmpty());
		ArrayList a3=new ArrayList();
		System.out.println(a3.isEmpty());
		
		
	}

}
