package codechef;

import java.util.Scanner;

public class CodeChefStarterQuestions
{

	public static void main(String[] args) throws java.lang.Exception
	{

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			// your code goes here
			int n = sc.nextInt();
			sc.nextLine();
			int arr[] = new int[n];
			int pages = 0;
			for(int i = 0; i < n; i++)
			{
				arr[i] = sc.nextInt();
				pages += arr[i];
			}
			if(n >= 2 && pages % 2 == 0)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("NO");
			}

		}
		sc.close();
	}

}
