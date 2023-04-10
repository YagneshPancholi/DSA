package theory;

public class Subarrays
{
	// subarray == continuous part of array

	static void printSubarrays(int numbers[])
	{
		int maxSum = Integer.MIN_VALUE;
		int currSum = 0;
		int prefix[] = new int[numbers.length];
		prefix[0] = numbers[0];
		for(int i = 1; i < prefix.length; i++)
		{
			prefix[i] = prefix[i - 1] + numbers[i];
		}

		for(int i = 0; i < numbers.length; i++)
		{
			int start = i;
			for(int j = i; j < numbers.length; j++)
			{
				int end = j;
				currSum = 0;
				//				for(int k = start; k <= end; k++)
				//				{
				//					System.out.print(numbers[k] + " ");
				//					sum += numbers[k];
				//				}
				currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
				if(currSum > maxSum)
				{
					maxSum = currSum;
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("max Sum = " + maxSum);
	}

	public static int kadanes(int numbers[])
	{
		int cs = 0;
		int ms = Integer.MIN_VALUE;
		for(int i = 0; i < numbers.length; i++)
		{
			cs = cs + numbers[i];
			ms = Math.max(cs, ms);
			if(cs < 0)
			{
				cs = 0;
			}
		}
		return ms;
	}

	public static void main(String[] args)
	{
		int numbers[] = {-1,};
		//printSubarrays(numbers);
		System.out.println(kadanes(numbers));
	}

}
