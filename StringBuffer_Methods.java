package basis.java.part3;

public class StringBuffer_Methods {

	public static void main(String[] args) 
	{
		//concat
		/*String fname="Sanskruti";
		String lname=" Chand";
		System.out.println(fname.concat(lname));*/
		
		//append (same as concatenation)
		StringBuffer sb=new StringBuffer("Sanskruti");
		sb=sb.append(" Chand");
		System.out.println(sb);
		
		//insert
		StringBuffer sb1=new StringBuffer("Sanskruti Rajwar");
		//sb1.insert(9, " Chand");
		System.out.println(sb1);
		
		//replace
		StringBuffer sb2=new StringBuffer("Twinkle Star");
		//sb2.replace(8, 13, " Shining ");
		System.out.println(sb2);
		
		//delete
		sb2.delete(8, 13);
		System.out.println(sb2);
		
		//reverse
		StringBuffer sb3=new StringBuffer("Sansu");
		System.out.println(sb3.reverse());
		
		//capacity
		System.out.println(sb2.capacity());
		
		//charAt
		System.out.println(sb3.charAt(2));
		
		//length
		System.out.println(sb3.length());
		
		//substring with single and double para
		StringBuffer sb4=new StringBuffer("Sansu");
		System.out.println(sb4.substring(1));
		System.out.println(sb4.substring(1, 4));
		

	}

}
