package theory;

import java.util.HashSet;
import java.util.Set;

public class ArraysQuestions
{
	public static boolean twiceOrMoreOccurance(int[] nums)
	{
		boolean flag = false;
		Set<Integer> mySet = new HashSet<>();
		for(int i = 0; i < nums.length; i++)
		{
			if(mySet.contains(nums[i]))
			{
				return true;
			}
			else
			{
				mySet.add(nums[i]);
			}
		}
		return flag;
	}

	public static void main(String[] args)
	{
		int[] nums = {1, 2, 3, 4, 5, 3};
		System.out.println(twiceOrMoreOccurance(nums));

	}

}
