package Assignment_4;

import java.util.Scanner;

public class a3_Print_the_numbers_which_are_divisible_by_7_for_the_range_of_150_to_200 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter the Starting Number : ");		
		int startingNumber = scanner.nextInt();
		
		System.out.println("Please Enter the Ending Number : ");		
		int endingNumber = scanner.nextInt();
				
		for(int i=startingNumber; i<=endingNumber; i++ ) //i optional i replace with number it's our wish
			if(i%7 == 0)
			System.out.println(i);
		
		scanner.close();
	}

}
