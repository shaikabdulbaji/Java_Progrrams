package Assignment_4;

import java.util.Scanner;

public class a5_Print_the_odd_numbers_between_200_to_25_in_reverse_order {

	public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter the Starting Number : ");		
		int startingNumber = scanner.nextInt();
		
		System.out.println("Please Enter the Ending Number : ");		
		int endingNumber = scanner.nextInt();
		
		/*
		 * ekada reverse lo print chaiyali kabati ending number pedadt and stating number chinadi anduku
		   i>=endingNumber ela rastamu.
		 */
		
				
		for(int i=startingNumber; i>=endingNumber; i-- ) //i optional i replace with number it's our wish
			if(i%2 == 1)
			System.out.println(i);
		
		scanner.close();
	}

}
