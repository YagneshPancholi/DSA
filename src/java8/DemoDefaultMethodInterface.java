package java8;

interface Phone
{
	void call();

	default void message()
	{
		System.out.println("Messaging!!!");
	}
}

class AndroidPhone implements Phone
{
	public void call()
	{
		System.out.println("Calling!!!");
	}
}

public class DemoDefaultMethodInterface
{

	public static void main(String[] args)
	{
		Phone p = new AndroidPhone();
		p.call();
		p.message();
	}

}
