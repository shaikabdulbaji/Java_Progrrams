package b20Sum_of_all_digits_upto_given_number;

import java.util.Scanner;

public class Sample {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Any Number : ");
		
		int number = scan.nextInt();
		
		scan.close();
		
		int sum = 0;
		
		while(number!=0) {
			
			sum = sum+number%10;
			
		    number = number/10;
		}
		System.out.println(sum);
	}
}
