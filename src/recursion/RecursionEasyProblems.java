package recursion;

public class RecursionEasyProblems
{

	public static void main(String[] args)
	{
		//base case
		// work of function
		//call inner function
		//		printMe(10);
		//		System.out.println(findFactorial(6));
		//		System.out.println(fibonacci(8)); //TimeComplexity O(2^n)
		//		int[] arr = {1, 2, 3, 7, 4, 5};
		//		System.out.println(isSorted(arr, 0));
		System.out.println(optimizedPower(2, 5));
	}

	private static int optimizedPower(int i, int j)
	{
		if(j == 0)
		{
			return 1;
		}
		int temp = optimizedPower(i, j / 2);
		int halfPowSq = temp * temp;
		if((j & 1) == 1)
		{
			halfPowSq *= i;
		}
		return halfPowSq;
	}

	private static int fibonacci(int i)
	{
		if(i == 0)
		{
			return 0;
		}
		else if(i == 1)
		{
			return 1;
		}
		else
		{
			return fibonacci(i - 1) + fibonacci(i - 2);
		}
	}

	private static int findFactorial(int i)
	{
		if(i == 1)
		{
			return 1;
		}
		return findFactorial(i - 1) * i;
	}

	public static void printMe(int n)
	{
		if(n == 1)
		{
			System.out.println(n);
			return;
		}
		System.out.println(n);
		printMe(n - 1);
	}

	public static boolean isSorted(int[] arr, int i)
	{
		if(i == arr.length - 1)
		{
			return true;

		}
		if(arr[i] > arr[i + 1])
		{
			return false;
		}
		return isSorted(arr, i + 1);
	}

}
