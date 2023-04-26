package comparator;

public class Student
{
	private int		marks;
	private String	name;

	public int getMarks()
	{
		return marks;
	}

	public void setMarks(int marks)
	{
		this.marks = marks;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Student()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int marks, String name)
	{
		super();
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "Student [marks=" + marks + ", name=" + name + "]";
	}

	public int compareTo(Student o)
	{
		//		to sort in descending
		//		if(this.marks < o.marks)
		//			return 1;
		//		else if(this.marks > o.marks)
		//			return -1;
		//		else
		//			return 0;
		return o.marks - this.marks;

		//				to sort ascending
		//		if(this.marks < o.marks)
		//			return -1;
		//		else if(this.marks > o.marks)
		//			return 1;
		//		else
		//			return 0;
		//		return this.marks - o.marks;
	}

}
