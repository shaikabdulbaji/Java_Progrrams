package b18Swap_of_TwoNumbers;

import java.util.Scanner;

public class Sample {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter First Number : ");
		
		int a = scan.nextInt();
		
		System.out.println("Enter Second Number : ");
		
		int b = scan.nextInt();
		
		int temp;
		
		scan.close();
		
		System.out.println("Before Swapping a value : "+a);
		System.out.println("Before Swapping b value : "+b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After Swapping a value : "+a);
		System.out.println("After Swapping b value : "+b);
		
	}

}
