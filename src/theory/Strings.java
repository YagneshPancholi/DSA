package theory;

public class Strings
{

	public static void main(String[] args)
	{
//		String fruits[] = {
//				"apple","mango","banana","kivi","strawberry","papaiya"
//		};
//		String largest = fruits[0];
//		for(int i = 1;i<fruits.length;i++) {
//			if(largest.compareToIgnoreCase(fruits[i]) < 0) {
//				largest = fruits[i];
//			}
//			
//		}
//		System.out.println(largest);
		
		// == checks at object level
		String str1 = "Yagnesh";
		String str2 = new String("Yagnesh");
		//str2 will create new memory location in heap
		String str3 = "Yagnesh";
		//str3 will do not create new space but will point out str1 in HEAP memory(String pool)
		
		if(str1==str2) {
			System.out.println("EQUAL");
		}else {
			System.out.println("NOT EQUAL");
		}
		if(str1.equals(str2)) {
			System.out.println("EQUAL");
		}else {
			System.out.println("NOT EQUAL");
		}
		
		//StringBuilder
		StringBuilder sb = new StringBuilder();
		for(char ch = 'a';ch<='z';ch++) {
			sb.append(ch+" ");
		}
		System.out.println(sb);
	}	

}
