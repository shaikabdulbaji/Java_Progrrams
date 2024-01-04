package b24print_number_of_letters_digits_spaces_and_other_things_in_the_inputted_statement;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any Text : ");
		
		String str = scan.nextLine();
		
		scan.close();
		
		char[] c = str.toCharArray();
		
		int digits = 0;
		
		int letters = 0;
		
		int spaces = 0;
		
		int others = 0;
				
		for(Character ch : c) {
			
			if(Character.isDigit(ch)) {
				digits++;
			}else if(Character.isLetter(ch)) {
				letters++;
			}else if(Character.isSpaceChar(ch)) {
				spaces++;
			}else {
				others++;
			}
			
		}
		
		System.out.println(" Number of digits in given string is : "+digits);
		System.out.println(" Number of letters in given string is : "+letters);
		System.out.println(" Number of spaces in given string is : "+spaces);
		System.out.println(" Number of others in given string is : "+others);
	}

}
