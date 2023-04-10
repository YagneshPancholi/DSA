package theory;

public class MinMaxOfArray
{
	static class Pair
	{
		int	min;
		int	max;
	}

	static Pair getMinMaxValue(int[] arr)
	{
		Pair minMax = new Pair();
		int n = arr.length;
		// size 1 retrun min,max same
		if(n == 1)
		{
			minMax.max = arr[0];
			minMax.min = arr[0];
			return minMax;
		}
		//size>1
		//check 0 and 1 index elmt and compare with eachother and intialize min and max 
		if(arr[0] > arr[1])
		{
			minMax.max = arr[0];
			minMax.min = arr[1];
		}
		else
		{
			minMax.max = arr[1];
			minMax.min = arr[0];
		}
		for(int i = 2; i < arr.length; i++)
		{
			if(arr[i] > minMax.max)
			{
				minMax.max = arr[i];
			}
			if(arr[i] < minMax.min)
			{
				minMax.min = arr[i];
			}
		}
		return minMax;
	}

	public static void main(String[] args)
	{
		int arr[] = {1, 5, 2, 7, -9999, 88};
		Pair minMax = getMinMaxValue(arr);
		System.out.println("Minimum: " + minMax.min);
		System.out.println("Maximum: " + minMax.max);
	}

}
