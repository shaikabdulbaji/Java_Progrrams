package b11finds_the_quotient_and_reminder;

import java.util.Scanner;

public class Sample {
	
	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any Number : ");
		
		int num = scan.nextInt();
		
		System.out.println("Enter dividor : ");
		
		int divisor = scan.nextInt();
		
		System.out.println("Quiotent is : " +(num/divisor));
		
		System.out.println("Reminder is : " +(num%divisor));
		
		scan.close();
	}

}
