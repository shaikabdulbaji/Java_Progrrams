package Assignment_7;

import java.util.Scanner;

public class a1_count_the_number_of_characters_in_a_string {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter the String : ");
		
		String input = scanner.nextLine();
		
		System.out.println("Input : " +input);
		
		System.out.println("Output : " +input.length());
		
		scanner.close();
	}

}
