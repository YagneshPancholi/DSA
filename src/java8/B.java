package java8;

class C implements A
{
	public void print()
	{
		System.out.println("I am in c");
	}

	C()
	{
		print();
	}

}

public class B
{

	public static void main(String[] a1)
	{
		C c = new C();
		c.print();
	}
}
