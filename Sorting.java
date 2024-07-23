package basis.java.part3;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add("vansh");
		a1.add("sansu");
		a1.add("anu");
		a1.add("priya");
		a1.add("soni");
		a1.add("neelu");
		Collections.sort(a1);
		System.out.println(a1);
	}

}
