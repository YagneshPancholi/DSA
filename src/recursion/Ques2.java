package recursion;

public class Ques2
{
	static String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

	public static void main(String[] args)
	{
		//		printDigits(2001);
		System.out.println(lengthOfString("AABBaabb"));
	}

	private static int lengthOfString(String string)
	{
		if(string.isEmpty())
		{
			return 0;
		}
		else
		{
			return 1 + lengthOfString(string.substring(1));
		}
	}

	static void printDigits(int n)
	{
		if(n == 0)
		{
			return;
		}
		int lastDigit = n % 10;
		printDigits(n / 10);
		System.out.print(arr[lastDigit] + " ");
	}
}
