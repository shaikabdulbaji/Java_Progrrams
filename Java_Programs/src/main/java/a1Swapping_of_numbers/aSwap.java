package a1Swapping_of_numbers;

import java.util.Scanner;

public class aSwap {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Value of a : ");
		
		int a = scan.nextInt();
		
		System.out.println("Enter Value of b : ");
		
		int b = scan.nextInt();
		
		scan.close();
		
		System.out.println("Before swapping a value : "+a);
		System.out.println("Before swapping b value : "+b);
		
		int temp;
		
		temp = a; //temp ki a value assign iedi
		
		a = b; //a ki b value assign iedi
		
		b = temp; //temp value b ki assign iedi
		
		System.out.println("After swapping a value : "+a);
		System.out.println("After swapping b value : "+b);
		
	}

}
