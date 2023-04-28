package java8;

public class GenericsExample
{

	public static void main(String[] args)
	{
		Printer<Integer> IntPrinter = new Printer<>(23);
		IntPrinter.print();
		Printer<Double> DoublePrinter = new Printer<>(23.9);
		DoublePrinter.print();
		Printer<String> StrPrinter = new Printer<>("Yagnesh");
		StrPrinter.print();
	}

}

class Printer<T>
{
	T thingToPrint;

	public Printer(T thingToPrint)
	{
		this.thingToPrint = thingToPrint;
	}

	public void print()
	{
		System.out.println(thingToPrint);
	}
}
