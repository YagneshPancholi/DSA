package sortingAlgos;

public class MergeSort extends AddOOPSalso
{
	// TimeComplexity: O(nlogn)
	//	Space: O(n)
	public static void main(String[] args)
	{
		//		with divide and conquer
		//		mid = (startIndex + endIndex)/2
		//		OR 
		//		mid = startIndex+ (endIndex-startIndex)/2
		mergeSort(arr, 0, arr.length - 1);
		printArr(arr);
	}

	private static void mergeSort(int[] arr, int si, int ei)
	{
		if(si >= ei)
		{
			return;
		}
		int mid = si + (ei - si) / 2;
		mergeSort(arr, si, mid);
		mergeSort(arr, mid + 1, ei);
		merge(arr, si, mid, ei);
	}

	private static void merge(int[] arr, int si, int mid, int ei)
	{
		int[] tempArr = new int[ei - si + 1];
		int i = si;//itr for left part
		int j = mid + 1;//itr for right part
		int k = 0;//itr for tempArr
		while(i <= mid && j <= ei)
		{
			if(arr[i] < arr[j])
			{
				tempArr[k] = arr[i];
				i++;
			}
			else
			{
				tempArr[k] = arr[j];
				j++;
			}
			k++;
		}

		while(i <= mid)
		{
			tempArr[k++] = arr[i++];
		}
		while(j <= ei)
		{
			tempArr[k++] = arr[j++];
		}
		for(int i1 = si, k1 = 0; k1 < tempArr.length; k1++, i1++)
		{
			arr[i1] = tempArr[k1];
		}
	}

}
