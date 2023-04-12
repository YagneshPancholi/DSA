package java8;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class DemoForEach
{

	public static void main(String[] args)
	{
		List<Integer> myList = Arrays.asList(1, 3, 2, 4, 5, 8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
		Date a = new Date();
		myList.forEach(i -> System.out.println(i + 1));

		Date b = new Date();
		System.out.println((b.getTime() - a.getTime()) + " miliseconds");
		//ForEach
		Date c = new Date();
		for(Integer integer : myList)
		{
			System.out.println(integer);
		}
		Date d = new Date();
		System.out.println((d.getTime() - c.getTime()) + " milisecond");
	}

}
