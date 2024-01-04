package Assignment_3;

import java.util.Scanner;

public class a4_Print_the_sum_of_the_even_numbers_between_40_to_80 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter the Starting Number : ");		
		int startingNumber = scanner.nextInt();
		
		System.out.println("Please Enter the Ending Number : ");		
		int endingNumber = scanner.nextInt();
		
		int number = startingNumber;
		
		int sum = 0;
				
		while(number<=endingNumber)
		{
			
			if(number%2==0)
			sum = sum + number;
			number++;
			
		}
		
		System.out.println(sum);
		
		scanner.close();
	}

}
