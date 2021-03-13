package Com.JavaProgrammingOOPS;

//Write a Java program to find Duplicate characters available in a String

public class RemoveDupChars {
	
	public static void main(String[] args) {
		
		String str = "programming";
		StringBuilder sb1 = new StringBuilder();
		str.chars().distinct().forEach(c -> sb1.append((char)c));
		System.out.println(sb1);
		
	}

}
