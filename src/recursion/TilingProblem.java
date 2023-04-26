package recursion;

public class TilingProblem
{

	public static void main(String[] args)
	{
		//Floor size = 2 x n
		int n = 2;
		System.out.println(countWays(n));
		//remove Duplicates from string
		removeDuplicates("yagneshpancholi", 0, new StringBuilder(""), new boolean[26]);
	}

	private static void removeDuplicates(String string, int i, StringBuilder sb, boolean[] bs)
	{
		if(i == string.length())
		{
			System.out.println(sb);
			return;
		}
		char currChar = string.charAt(i);
		if(bs[currChar - 'a'] == true)
		{
			removeDuplicates(string, i + 1, sb, bs);
		}
		else
		{
			bs[currChar - 'a'] = true;
			removeDuplicates(string, i, sb.append(currChar), bs);
		}
	}

	public static int countWays(int n)
	{

		if(n == 0 || n == 1)
		{
			return 1;
		}
		int verticalTile = countWays(n - 1);
		int horizontalTile = countWays(n - 2);
		return verticalTile + horizontalTile;
	}

}
