package theory;

public class OOPS
{

	public static void main(String[] args)
	{
		Yagnesh y = new Yagnesh("Yagnesh");
		System.out.println(y.name);
		temp t = new temp("heyy");
		t.sayHello();

	}

}

class Yagnesh
{
	int		roll;
	String	name;

	Yagnesh(String name)
	{
		this.name = name;
		//		System.out.println("constructor is called");
	}

	public void sayHello()
	{
		System.out.println("Hello, Yagnesh");
	}

}

class temp extends Yagnesh
{

	temp(String name)
	{
		super(name);
	}

	public void sayHello()
	{
		System.out.println("hello, temp");
	}

}
