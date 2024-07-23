package basis.java.part3;

public class StringBuffer_Story {

	public static void main(String[] args) 
	{
		StringBuffer story=new StringBuffer("Once upon a time");
		story.append(", there was solider");
		story.insert(27, " brave");
		story.append(" who fought till the wining.");
		System.out.println(story);
	}

}
