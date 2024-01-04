package b29Square_of_Number;

import java.util.Scanner;

public class Sample {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Any Number : ");
		
		int s = scan.nextInt();
		
		System.out.println("Square of given number is : " + (s*s));
		
		scan.close();
	}

}
