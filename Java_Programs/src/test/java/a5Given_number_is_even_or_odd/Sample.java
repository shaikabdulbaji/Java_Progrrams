package a5Given_number_is_even_or_odd;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		
		int a = scan.nextInt();
		
		scan.close();
		
		if(a%2==0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
	}
}
