package Assignment_7;

import java.util.Scanner;

public class b11_find_the_max_length_word_in_a_given_string {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter the String : ");
		
		String input = scanner.nextLine();
		
		System.out.println("Input : " +input);
		
		String[] words = input.split(" ");
		String maxLengthWord = words[0];

		for(int i=0; i<words.length; i++)
		{
			if(maxLengthWord.length() < words[i].length())
				maxLengthWord = words[i];
		}
		
		System.out.println("Output : " +maxLengthWord);
		
		scanner.close();
	}

}
