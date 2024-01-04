package b23Takes_String_Print_duplicate_characters_along_with_number_of_times;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * ekada map or hashmap nduku use cheasamu ana ddani kosam e package lo screenshot refer chaiyandi.
 */

public class cCounting_of_duplicate_characters {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Any String : ");
		
		String str = scan.nextLine();
		
		scan.close();
		
		char[] ch = str.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c : ch) {

			if(map.containsKey(c)) {
				
				map.put(c, map.get(c)+1);
				
			}else {
				map.put(c, 1);
			}
		}
		
		for(Character c : map.keySet()) {
			
			if(map.get(c)>1) {
				
				System.out.println("Character is : "+c+" is repeated : "+map.get(c)+" times.");
			}
		}
	}

}
