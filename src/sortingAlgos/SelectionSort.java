package sortingAlgos;

public class SelectionSort extends AddOOPSalso
{

	public static void main(String[] args)
	{
		selectionSort(arr);
		printArr(arr);
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

}
