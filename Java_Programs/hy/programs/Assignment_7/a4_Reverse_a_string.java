package Assignment_7;

import java.util.Scanner;

public class a4_Reverse_a_string {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter the String : ");
		
		String input = scanner.nextLine();
		
		System.out.println("Input : " +input);
		
		String revString = "";
		// (or) String revString = new String();
	
		for(int i=input.length() - 1;  i >= 0  ; i--)
		{
			revString = revString + input.charAt(i);
		}
		
		System.out.println("Output : " +revString);
		
		scanner.close();
	}

}
