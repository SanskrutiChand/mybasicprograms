package basis.java.part3;

import java.util.Vector;

public class Vector_Methods {

	public static void main(String[] args) 
	{
		Vector<String> v1=new Vector<>();
		
		v1.add("apple");
		v1.add("mango");
		v1.add("cherry");
		v1.add("kiwi");
		System.out.println(v1);
		
		//addElement
		v1.add(1, "orange");
		System.out.println("Adding the 'Orange' as first element-"+v1);
		//firstElement
		String firstElement=v1.firstElement();
		System.out.println("First Element-"+firstElement);
		//lastElement
		String lastElement=v1.lastElement();
		System.out.println("Last Element-"+lastElement);
		//removeElement
		v1.removeElement("cherry");
		System.out.println("After removing 'apple'-"+v1);
		//removeElementAt
		v1.removeElementAt(2);
		System.out.println("Vector after removing element at index 2-"+v1);
		//removeAllElements
		v1.removeAllElements();
		System.out.println("Vector after removing all elements-"+v1);
		//capacity
		int Capacity=v1.capacity();
		System.out.println("Initial capacity of the vector-"+Capacity);
		
		
		
	}

}
