package Assignment_3;

import java.util.Scanner;

public class a5_Print_the_odd_numbers_between_200_to_25_in_reverse_order {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter the Starting Number : ");		
		int startingNumber = scanner.nextInt();
		
		System.out.println("Please Enter the Ending Number : ");		
		int endingNumber = scanner.nextInt();
		
		int number = startingNumber;
				
		while(number>=endingNumber)
		{
			
			if(number%2==1)
			System.out.println(number);
			number--;
			
		}
		
		scanner.close();
	}

}
