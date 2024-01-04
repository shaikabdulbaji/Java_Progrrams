package a1Swapping_of_numbers;

import java.util.Scanner;

public class eSwap {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Value of a : ");
		
		int a = scan.nextInt();
		
		System.out.println("Enter Value of b : ");
		
		int b = scan.nextInt();
		
		scan.close();
		
		System.out.println("Before swapping a value : "+a);
		System.out.println("Before swapping b value : "+b);
		
		b = (a+b) - (a=b);
		
		System.out.println("After swapping a value : "+a);
		System.out.println("After swapping b value : "+b);
		
	}

}
