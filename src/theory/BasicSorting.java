package theory;

public class BasicSorting
{
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
				//System.out.println("here");
				break;
			}
		}
	}

	//find the smallest in unsorted array
	//and put it at the start of array
	//O(n^2)
	public static void selectionSort(int[] arr)
	{
		for(int i = 0; i < arr.length - 1; i++)
		{
			//to find minValuePosition
			int minPos = i;
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[minPos] > arr[j])
				{
					minPos = j;
				}
			}
			//swap
			int temp = arr[minPos];
			arr[minPos] = arr[i];
			arr[i] = temp;
		}
	}

	//Pick an elmt form unsorted array 
	//and put it in correct position in sorted array
	//O(n^2)
	public static void insertionSort(int[] arr)
	{
		for(int i = 1; i < arr.length; i++)
		{
			int curr = arr[i];
			int prev = i - 1;
			//finding correct positon to insert
			while(prev >= 0 && arr[prev] > curr)
			{
				arr[prev + 1] = arr[prev];
				prev--;
			}
			//insert
			arr[prev + 1] = curr;

		}
	}

	public static void printArray(int arr[])
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args)
	{
		int[] arr = {5, 4, 1, 3, 2};
		//	bubbleSort(arr);
		//selectionSort(arr);
		//insertionSort(arr);
		//Arrays.sort(arr);//O(nlogn)
		//Arrays.sort(arr, 0, 3);
		//Arrays.sort) arr, Collections.reverseOrder());
		printArray(arr);
	}

}
