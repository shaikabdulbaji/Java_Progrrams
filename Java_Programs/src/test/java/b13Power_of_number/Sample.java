package b13Power_of_number;

import java.util.Scanner;

public class Sample {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any Number : ");
		
		int number = scan.nextInt();
		
		int initialNumber = number;
		
		System.out.println("Power Number : ");
		
		int power = scan.nextInt();
		
		scan.close();
		
		for(int i=1; i<power; i++)
			number = initialNumber * number;
		
		System.out.println("Initial Number is : "+ initialNumber + " Power is : "+ power + " =" + number);
		
	}

}
