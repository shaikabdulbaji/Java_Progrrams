package b20Sum_of_all_digits_in_given_inputtednumber;

import java.util.Scanner;

public class Sample {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Any Number : ");
		
		int n = scan.nextInt();
		
		scan.close();
		
		int div = n*(n+1);
		
		int sum = div/2;
		
		System.out.println(sum);
		
	}
}
