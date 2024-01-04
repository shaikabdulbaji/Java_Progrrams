package Assignment_7;

import java.util.Scanner;

public class a6_Reverse_each_word_of_a_given_string {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter the String : ");
		
		String input = scanner.nextLine();
		
		System.out.println("Input : " +input);
		
		String[] words = input.split(" ");

		String outputString = "";
		for(int i=0; i<words.length; i++)
		{
			String word = words[i];
			String revWord = "";
			for(int j=word.length() - 1;  j >= 0  ; j--)
			{
				revWord = revWord + word.charAt(j);
			}
			if(i != words.length - 1)
				outputString = outputString + revWord + " ";
			else
				outputString = outputString + revWord;
		}
		
		System.out.println("Output : " +outputString);
		
		scanner.close();
	}

}
