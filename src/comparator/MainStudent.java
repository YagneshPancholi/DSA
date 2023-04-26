package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainStudent
{

	public static void main(String[] args)
	{
		List<Student> students = new ArrayList<>();
		students.add(new Student(50, "Yagnesh"));
		students.add(new Student(79, "Vinit"));
		students.add(new Student(95, "Nimit"));
		students.add(new Student(66, "Prerak"));
		students.add(new Student(99, "Jaimin"));
		students.add(new Student(96, "Jaimin"));
		students.add(new Student(99, "Anurodh"));
		//		Collections.sort(students);
		//		Collections.sort(students, new Comparator<Student>() {
		//
		//			@Override
		//			public int compare(Student o1, Student o2)
		//			{
		//				if(o1.getName().equals(o2.getName()))
		//				{
		//					return o1.getMarks() - o2.getMarks();
		//				}
		//				else
		//				{
		//					return o1.getName().compareTo(o2.getName());
		//				}
		//			}
		//
		//		});
		Collections.sort(students, (o1, o2) -> {
			if(o1.getName().equals(o2.getName()))
			{
				return o1.getMarks() - o2.getMarks();
			}
			else
			{
				return o1.getName().compareTo(o2.getName());
			}
		});
		students.forEach(System.out::println);
	}

}
