package basics.java.part2;

public class String_Reverse {

	public static void main(String[] args) 
	{
		
	//first method of reverse a string
		String name="Sanskruti";
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.print(name.charAt(i));
		}
			
			//second method of reverse a string
			String name1="My name is Sanskruti Chand";
			String input= name1.toLowerCase();
			String reverse="";
			for(int i=input.length()-1;i>=0;i--)
			{
				char c=input.charAt(i);
				reverse=reverse+c;
				//System.out.println(reverse);
			}
			System.out.println(reverse);
		}
	

}
