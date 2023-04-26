package codechef;

import java.math.BigInteger;
import java.util.Scanner;

public class Codechef85
{
	static int mod(String num, int a)
	{

		// Initialize result
		int res = 0;

		// One by one process all digits of 'num'
		for(int i = 0; i < num.length(); i++)
			res = (res * 10 + num.charAt(i) - '0') % a;

		return res;
	}

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			// your code goes here
			BigInteger n = sc.nextBigInteger();
			System.out.println(n);
			//System.out.println(n % 20);
			System.out.println(mod(n.toString(), 20));
		}
		sc.close();

	}

}
