package b23Takes_String_Print_duplicate_characters_along_with_number_of_times;

import java.util.Scanner;

public class bDuplicate_Characters_in_string {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Any String : ");
		
		String str = scan.nextLine();
		
		char[] ch = str.toCharArray();
		
		System.out.print("Duplicate Characters in above string are: ");
		for (int i = 0; i < str.length(); i++) {
		   for (int j = i + 1; j < str.length(); j++) {
		      if (ch[i] == ch[j]) {
		         System.out.print(ch[j] + " ");
		         break;
		      }
		   }
		}
	}
}
