package b23Takes_String_Print_duplicate_characters_along_with_number_of_times;

import java.util.Scanner;

public class aString_to_charArray {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Any String : ");
		
		String str = scan.nextLine();
		
		char[] ch = str.toCharArray();
		
		for(char c : ch) {
		System.out.println(c);
		}
	}

}
