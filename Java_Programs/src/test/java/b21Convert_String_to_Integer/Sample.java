package b21Convert_String_to_Integer;

public class Sample {
	
	public static void main(String[] args) {
		
		//String s1 = "abdul";
		//Exception in thread "main" java.lang.NumberFormatException: For input string: "abdul"
		
		String s1 = "101";
		
		int num = Integer.parseInt(s1);
		
		System.out.println(num);
		
	}

}
