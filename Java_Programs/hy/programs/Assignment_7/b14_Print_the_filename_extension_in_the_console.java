package Assignment_7;

import java.util.Scanner;

public class b14_Print_the_filename_extension_in_the_console {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter the String : ");
		
		String input = scanner.nextLine();
		
		System.out.println("Input : " +input);
		
		String output = input.substring(input.lastIndexOf(".")+1, input.length());
		// e +1 aneadi . print kakunda
		
		System.out.println("Output : " +output);
		
		scanner.close();
	}

}
