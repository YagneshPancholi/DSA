package recursion;

public class Ques3
{

	public static void main(String[] args)
	{
		System.out.println(wasyOfContiguousStringbeginendwithsamechar("aba"));
	}

	private static int wasyOfContiguousStringbeginendwithsamechar(String string)
	{
		if(string.length() == 1)
		{
			return 1;
		}
		return 0;

	}

}
