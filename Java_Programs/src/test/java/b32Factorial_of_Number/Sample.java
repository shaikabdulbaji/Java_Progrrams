package b32Factorial_of_Number;

import java.util.Scanner;

public class Sample {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Any Number : ");
		
		int s = scan.nextInt();
		
		scan.close();
		
		int fact=1;
		
		for(int i=1; i<=s; i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
