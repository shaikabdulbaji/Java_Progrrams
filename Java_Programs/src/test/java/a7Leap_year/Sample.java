package a7Leap_year;

import java.util.Scanner;

/*
 * Leap Year is an year having 366 days, while the normal year has 365 days.
 * If the year is evenly divisible by 4 and not divisible by 100, then it is a Leap year.
 * If the year is evenly divisible by both 4 and 100, then we need to check if it is evenly 
   divisible by 400, to confirm it as Leap year.
 */

public class Sample {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter any year : ");

		int year = scan.nextInt();
		
		scan.close();
		
		boolean isLeapYear = false;
		
		if(year%4==0) {

			if(year%100==0) {
				
				if(year%400==0) {
					isLeapYear = true;
				}else {
					isLeapYear = false;
				}
				
			}else {
				isLeapYear = true;
			}
		}else {
			isLeapYear = false;
		}
		
		if(isLeapYear)
			System.out.println("Given year is Leap Year");
		else 
			System.out.println("Given year is not a Leap Year");
	}

}
