package Assignment_4;

import java.util.Scanner;

public class a2_Print_even_numbers_between_200_and_500 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter the Starting Number : ");		
		int startingNumber = scanner.nextInt();
		
		System.out.println("Please Enter the Ending Number : ");		
		int endingNumber = scanner.nextInt();
				
		for(int i=startingNumber; i<=endingNumber; i++ ) //i optional i replace with number it's our wish
			if(i%2 == 0)
			System.out.println(i);
		
		scanner.close();
	}

}