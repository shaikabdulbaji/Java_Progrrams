package Assignment_7;

import java.util.Scanner;

public class a2_count_the_number_of_words_in_a_string {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter the String : ");
		
		String input = scanner.nextLine();
		
		System.out.println("Input : " +input);
		
		String[] words = input.split(" "); 
		/*
		 * manam echea string lo spaces untai kada akadiki split cheasi array la estadi aa split 
		   cheasina words a manam output.
		 */
		
		System.out.println("Output : " +words.length);
		
		scanner.close();
	}

}
