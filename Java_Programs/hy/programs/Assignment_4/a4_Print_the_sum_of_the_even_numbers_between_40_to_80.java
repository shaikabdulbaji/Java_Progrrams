package Assignment_4;

import java.util.Scanner;

public class a4_Print_the_sum_of_the_even_numbers_between_40_to_80 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter the Starting Number : ");		
		int startingNumber = scanner.nextInt();
		
		System.out.println("Please Enter the Ending Number : ");		
		int endingNumber = scanner.nextInt();
		
		int sum = 0;
				
		for(int i=startingNumber; i<=endingNumber; i++ ) //i optional i replace with number it's our wish
		{
			if(i%2 == 0)
				sum = sum + i;
		}
			System.out.println(sum);
		
		scanner.close();
	}

}
