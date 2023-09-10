package a4Scanner;

import java.util.Scanner;

public class Sample {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		
		int firstNumber = scan.nextInt();
		
		System.out.println("Enter second number : ");
		
		int secondNumber = scan.nextInt();
		
		scan.close();
		
		System.out.println("The sum of numbers is : "+ (firstNumber+secondNumber));
	}

}
