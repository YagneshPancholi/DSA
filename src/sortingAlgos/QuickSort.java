package sortingAlgos;

public class QuickSort extends AddOOPSalso
{
	//avgCase  O(nlogn)
	//worstCase O(n^2) it occurs when arr is already sorted either 
	//	in ascending or descending
	//space O(1)
	public static void main(String[] args)
	{
		//pivot & partition 
		//		1. take last elmt as pivot
		//		2.partition
		//		3.quicksort for left part
		//		quicksort for right part

		quickSort(arr, 0, arr.length - 1);
		printArr(arr);
	}

	private static void quickSort(int[] arr, int si, int ei)
	{
		if(si >= ei)
		{
			return;
		}
		int pivotIndex = partition(arr, si, ei);
		quickSort(arr, si, pivotIndex - 1);
		quickSort(arr, pivotIndex + 1, ei);
	}

	private static int partition(int[] arr, int si, int ei)
	{
		int pivot = arr[ei];
		int i = si - 1;
		for(int j = si; j < ei; j++)
		{
			if(arr[j] < pivot)
			{
				i++;
				//swap
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		i++;
		int temp = pivot;
		arr[ei] = arr[i];
		arr[i] = temp;
		return i;
	}

}
