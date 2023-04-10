package codechef;

/* package codechef; // don't place package name! */
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Starter76
{
	//	public static void main(String[] args) throws java.lang.Exception
	//	{
	//
	//		Scanner sc = new Scanner(System.in);
	//		int t = sc.nextInt();
	//		while(t-- > 0)
	//		{
	//			// your code goes here
	//			int n = sc.nextInt();
	//			int x = sc.nextInt();
	//			int y = sc.nextInt();
	//			//			System.out.println(n + " " + x + " " + y);
	//			float d = (float) n / (float) x;
	//			System.out.println(d);
	//			if(d <= y)
	//			{
	//				System.out.println("YES");
	//			}
	//			else
	//			{
	//				System.out.println("NO");
	//			}
	//		}
	//	}

	//public static void main(String[] args) throws java.lang.Exception
	//	{
	//
	//		Scanner sc = new Scanner(System.in);
	//		int t = sc.nextInt();
	//		while(t-- > 0)
	//		{
	//			// your code goes here
	//			int x = sc.nextInt();
	//			int y = sc.nextInt();
	//			int z = sc.nextInt();
	//			if(x == 1 && y == 1 && z == 1)
	//			{
	//				System.out.println("NO");
	//			}
	//			else if(x == y)
	//			{
	//				if(x - 1 != z && x + 1 != z)
	//				{
	//					System.out.println("YES");
	//				}
	//				else
	//				{
	//					System.out.println("NO");
	//				}
	//			}
	//			else if(x == z)
	//			{
	//				if(x - 1 != y && x + 1 != y)
	//				{
	//					System.out.println("YES");
	//				}
	//				else
	//				{
	//					System.out.println("NO");
	//				}
	//			}
	//			else if(y == z)
	//			{
	//				if(y - 1 != x && y + 1 != x)
	//				{
	//					System.out.println("YES");
	//				}
	//				else
	//				{
	//					System.out.println("NO");
	//				}
	//			}
	//			else
	//			{
	//				System.out.println("YES");
	//			}
	//
	//		}
	//
	//	}

	//	public static void main(String[] args) throws java.lang.Exception
	//	{
	//
	//		Scanner sc = new Scanner(System.in);
	//		int t = sc.nextInt();
	//		while(t-- > 0)
	//		{
	//			// your code goes here
	//			int n = sc.nextInt();
	//			sc.nextLine();
	//			String s = sc.nextLine();
	//			int onecount = 0;
	//			int zerocount = 0;
	//			for(int i = 0; i < n; i++)
	//			{
	//				if(s.charAt(i) == '1')
	//				{
	//					onecount++;
	//				}
	//				else
	//				{
	//					zerocount++;
	//				}
	//			}
	//			//System.out.println(onecount + " " + zerocount);
	//			if(onecount==zerocount) {
	//				System.out.println(onecount);
	//			}else if(onecount>zerocount) {
	//				System.out.println(zerocount);
	//			}else {
	//				System.out.println(onecount);
	//			}
	//		}

	public static void main(String[] args) throws java.lang.Exception
	{

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			// your code goes here
			int n = sc.nextInt();
			int d;
			for(int i = 1; i <= n; i++)
			{
				for(int j = i + 1; j <= n; j++)
				{
					d = j - i + 1;

				}
			}
		}
	}

}