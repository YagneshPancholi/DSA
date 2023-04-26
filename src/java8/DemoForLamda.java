package java8;

public class DemoForLamda
{
	interface A
	{
		void show(int i);
	}

	public static void main(String[] args)
	{
		A obj;
		//		obj = new A() {
		//			public void show(int i)
		//			{
		//				System.out.println("Hiii, This is example of INNER Class");
		//			}
		//		};
		obj = (i) -> System.out.println("hiii, Another one!! " + i);
		// implementaion of Consumer Interface

		obj.show(7);
	}

}
