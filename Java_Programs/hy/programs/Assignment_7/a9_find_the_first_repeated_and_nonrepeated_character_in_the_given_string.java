package Assignment_7;

import java.util.Scanner;

public class a9_find_the_first_repeated_and_nonrepeated_character_in_the_given_string {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter the String : ");
		
		String input = scanner.nextLine();
		
		System.out.println("Input : " +input);
		
		char firstRepeatedCharacter = ' ';
		char firstNonRepeatedCharacter = ' '; 
		
		for(int i=0; i<input.length(); i++)
		{
			char tempChar = input.charAt(i);
			if(tempChar!= ' ')
			{
				if(input.indexOf(tempChar) == input.lastIndexOf(tempChar))
				{
					if(firstNonRepeatedCharacter == ' ')
						firstNonRepeatedCharacter = tempChar;
				}
				else if(firstRepeatedCharacter == ' ')
					firstRepeatedCharacter = tempChar; 
				if(firstNonRepeatedCharacter != ' ' && firstRepeatedCharacter != ' ')
					break;
			}
		}
		
		System.out.println("First Repeated Character --> " +firstRepeatedCharacter);
		System.out.println("First Non Repeated Character --> " +firstNonRepeatedCharacter);
		
		scanner.close();
	}

}
