package Assignment_7;

import java.util.Scanner;

public class a3_count_the_number_of_total_number_of_occurrences_of_a_given_character_in_a_string2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter the String : ");		
		String input = scanner.nextLine();
		
		//edi nduku antea manam echina string lo a character kavalo ekada evali daniki e line.
		System.out.println("Please Enter the Target Character : ");
		char targetChar = scanner.next().charAt(0); 
		
		System.out.println("Input : " +input);
		System.out.println("Target Character : " +targetChar);
		
		char[] characters = input.toCharArray();
		int count = 0;
		for(int i=0; i<characters.length; i++)
		{
			if(characters[i] == targetChar)
				count++;
		}
		
		System.out.println("Output : " +count);
		
		scanner.close();
	}

}
