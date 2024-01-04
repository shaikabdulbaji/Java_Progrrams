package a1Swapping_of_numbers;

import java.util.Scanner;

public class dSwap {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Value of a : ");
		
		int a = scan.nextInt();
		
		System.out.println("Enter Value of b : ");
		
		int b = scan.nextInt();
		
		scan.close();
		
		System.out.println("Before swapping a value : "+a);
		System.out.println("Before swapping b value : "+b);
		
		a = a^b; //suppose a=10, b=20. a=10^20=30.
		b = a^b; //b ki 10 value assign iedi. 30^20=10.
		a = a^b; //a ki 20 value assign iedi. 30^10=20.
		
		System.out.println("After swapping a value : "+a);
		System.out.println("After swapping b value : "+b);
		
	}

}
