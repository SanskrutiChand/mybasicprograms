package basics.java.part2;

public class SpecialCharacters 
{
	static int count_of_digit=0;
	static int count_of_alphabets=0;
	static int count_of_space=0;

	public static void main(String[] args) 
	{
		//to find how many numeric are present in a given String
				String s="my roll no is 21875 !@#$%^&*";
				char c[]=s.toCharArray();
				//System.out.println(Arrays.toString(c2));
				for(int i=0;i<s.length();i++)
				{
					boolean b1=Character.isDigit(c[i]);
					if(b1==true)
					{
						count_of_digit++;
					}
						
					//to find how many alphabets are present in a given String
				    boolean b2= Character.isLetter(c[i]);
				    if(b2==true)
				    {
					    count_of_alphabets++;
				    }
				    
				    //to find how many space are present in a given String
				    boolean b3=Character.isSpaceChar(c[i]);
				    if(b3==true)
				    {
				    	count_of_space++;
				    }
				}
				
				    //to find how many special character in a given String
			
				int count_of_SpecialCharacters = s.length()-count_of_alphabets-count_of_digit-count_of_space;
				System.out.println("count_of_SpecialCharacters = "+count_of_SpecialCharacters);
				

				    
			        System.out.println("The numeric in agiven String:" +count_of_digit);
				    System.out.println("The alphabets in the given String:"+count_of_alphabets);
				    System.out.println("The space in the given String:"+count_of_space);
	}
	
}
