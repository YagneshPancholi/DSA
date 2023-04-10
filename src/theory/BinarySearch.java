package theory;

import java.util.Arrays;

public class BinarySearch
{

	public static void main(String[] args)
	{
		int numbers[] = {1, 4, 9, 6, 44, 32, 99, 88};
		Arrays.sort(numbers);
		int start = 0;
		int end = numbers.length - 1;
		int key = 999;
		boolean flag = false;
		while(start <= end)
		{
			int mid = (start + end) / 2;
			if(numbers[mid] == key)
			{
				flag = true;
				System.out.println(mid);
				break;
			}
			else if(mid > key)
			{
				end = mid - 1;
			}
			else
			{
				start = mid + 1;
			}
		}
		if(flag)
		{
			System.out.println("found key ");
		}
		else
		{
			System.out.println(" not found key ");

		}

	}

}
