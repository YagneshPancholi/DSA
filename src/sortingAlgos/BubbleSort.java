package sortingAlgos;

public class BubbleSort extends AddOOPSalso
{

	public static void main(String[] args)
	{
		bubbleSort(arr);
		printArr(arr);
	}

	//It compare adjacent element and 
	//swap it if they are not in correct order
	//O(N^2) // O(n) for sorted array input
	public static void bubbleSort(int[] arr)
	{
		for(int turn = 0; turn < arr.length - 1; turn++)
		{
			int swaps = 0;
			for(int j = 0; j < arr.length - 1 - turn; j++)
			{

				if(arr[j] > arr[j + 1])
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swaps++;
				}
			}
			if(swaps == 0)
			{
				break;
			}
		}
	}

}
