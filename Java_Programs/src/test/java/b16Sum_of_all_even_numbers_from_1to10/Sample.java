package b16Sum_of_all_even_numbers_from_1to10;

import java.util.Scanner;

public class Sample {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Any Number : ");

		int num = scan.nextInt();
		
		scan.close();
		
		int sum = 0;
		
		for(int i=0; i<=num; i++) {
			if(i%2==0) {
				sum = sum+i;
			}
		}
		System.out.println(sum);
	}

}
