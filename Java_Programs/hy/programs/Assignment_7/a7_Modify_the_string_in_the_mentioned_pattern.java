package Assignment_7;

import java.util.Scanner;

public class a7_Modify_the_string_in_the_mentioned_pattern {

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
			
			if(i%2==0)
				outputString = outputString + word.toUpperCase();
			else
				outputString = outputString + getReverseString(word);
			
			
			if(i != words.length - 1)
				outputString = outputString + " ";
			
		}
		
		System.out.println("Output : " +outputString);
		
		scanner.close();
	}
	
	private static String getReverseString(String inputString)
	{
		String revString = "";
		for(int j=inputString.length() - 1;  j >= 0  ; j--)
		{
			revString = revString + inputString.charAt(j);
		}
		return revString;	
	}

}
