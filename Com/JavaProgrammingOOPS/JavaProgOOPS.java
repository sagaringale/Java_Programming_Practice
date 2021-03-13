package Com.JavaProgrammingOOPS;

public class JavaProgOOPS {

	public static void main(String[] args) {
		//Reverse
		String str = "Hello";
		
		//Approach-1
		char[] chArr = str.toCharArray();
		for(int i = chArr.length - 1; i>=0; i--) {
			System.out.println(chArr[i]);
		}
		
		System.out.println("");
		//Approach-2
		for(int i = str.length()-1; i>=0; i--) {
			System.out.println(str.charAt(i));
		}
		
		System.out.println("");
		//Approach-3
		StringBuilder sbuilder = new StringBuilder(str);
		System.out.println(sbuilder.reverse());
		
		//Approach-4
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
	}

}
