package theory;

public class SieveOfEratosthenes
{
	public static void main(String args[])
	{
		int n = 50;
		boolean primes[] = new boolean[n + 1];
		sieveOfEratosthenes(n, primes);
	}
	//bydefalut boolean array is false so we assume false means No is Prime

	static void sieveOfEratosthenes(int n, boolean[] primes)
	{
		for(int i = 2; i * i <= n; i++)
		{
			if(!primes[i])
			{
				for(int j = i * 2; j <= n; j += i)
				{
					primes[j] = true;
				}
			}
		}
		for(int i = 2; i <= n; i++)
		{
			if(!primes[i])
			{
				System.out.println(i + " ");
			}
		}

	}
}
