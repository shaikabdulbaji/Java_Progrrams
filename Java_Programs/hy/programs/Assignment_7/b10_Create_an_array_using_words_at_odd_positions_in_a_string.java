package Assignment_7;

import java.util.Arrays;
import java.util.Scanner;

public class b10_Create_an_array_using_words_at_odd_positions_in_a_string {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter the String : ");
		
		String input = scanner.nextLine();
		
		System.out.println("Input : " +input);

		
		String[] words = input.split(" ");
		String[] outputArr = new String[words.length/2];
		int index = 0;
		for(int i=0; i<words.length; i++)
		{
			if(i%2!=0) 
			{
				outputArr[index] = words[i];
				index++;
			}
		}
		
		
		System.out.println("Output : " +Arrays.toString(outputArr));
		
		scanner.close();
	}

}
