package recursion;

public class RecursionQues
{

	public static void main(String[] args)
	{
		int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
		int key = 2;
		printOccurance(arr, key, 0);
	}

	private static void printOccurance(int[] arr, int key, int index)
	{
		if(index == arr.length)
		{
			System.out.println(index);
			return;
		}
		if(arr[index] == key)
		{
			System.out.println(index);
		}
		printOccurance(arr, key, index + 1);
	}

}
