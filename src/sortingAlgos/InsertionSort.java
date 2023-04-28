package sortingAlgos;

public class InsertionSort extends AddOOPSalso
{

	public static void main(String[] args)
	{
		insertionSort(arr);
		printArr(arr);
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

}
