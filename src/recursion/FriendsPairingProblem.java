package recursion;

public class FriendsPairingProblem
{

	public static void main(String[] args)
	{
		int n = 3;
		//		System.out.println(findFrindsPair(n));
		printBinaryStringWithoutConsecutiveones(n, 0, "");
	}

	private static void printBinaryStringWithoutConsecutiveones(int n, int lastPlaced, String sb)
	{
		if(n == 0)
		{
			System.out.println(sb);
			return;
		}
		printBinaryStringWithoutConsecutiveones(n - 1, 0, sb + "0");
		if(lastPlaced == 0)
		{
			printBinaryStringWithoutConsecutiveones(n - 1, 1, sb + "1");
		}
	}

	private static int findFrindsPair(int n)
	{
		if(n == 1 || n == 2)
		{
			return n;
		}
		return findFrindsPair(n - 1) + (n - 1) * findFrindsPair(n - 2);
	}

}
