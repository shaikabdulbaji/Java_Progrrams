package b15Average_of_numbers;

import java.util.Scanner;

public class Sample {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter First Number : ");
		
		int a = scan.nextInt();
		
		System.out.println("Enter Second Number : ");
		
		int b = scan.nextInt();
		
		System.out.println("Enter Third Number : ");
		
		int c = scan.nextInt();
		
		System.out.println("Enter Fourth Number : ");
		
		int d = scan.nextInt();
		
		System.out.println("Enter Fifth Number : ");
		
		int e = scan.nextInt();
		
		System.out.println("Enter Sixth Number : ");
		
		int f = scan.nextInt();
		
		scan.close();
		
		int sum = a+b+c+d+e+f;
		
		int avg = sum/6;
		
		System.out.println("The Average Of Six Numbers is : " + avg);
		
	}

}
