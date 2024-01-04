package Assignment_7;

import java.util.Scanner;

public class a5_Remove_all_starting_and_ending_spaces_from_a_string {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter the String : ");
		
		String input = scanner.nextLine();
		
		System.out.println("Input : " +input);
		
		System.out.println("Output : " +input.trim());
		
		scanner.close();
	}

}
