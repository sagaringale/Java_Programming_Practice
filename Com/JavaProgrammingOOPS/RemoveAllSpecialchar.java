package Com.JavaProgrammingOOPS;

public class RemoveAllSpecialchar {

	public static void main(String[] args) {
		
		String str = "$ja!va$&st%ar";
		
		//Approach - 1 (replaceAll() method)
		String plainStr = str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(plainStr);

	}

}
