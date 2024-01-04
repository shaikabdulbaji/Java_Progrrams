package b25Fibonacci_series_till_given_number;

import java.util.Scanner;

public class bSample_100percent_work {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Any Number : ");
		
		int number = scan.nextInt();
		
		scan.close();
		
		int a=1;
		
		int b=1;
		
		System.out.print(a+" ");
		System.out.print(b+" ");
		
		int f=0;
		
		while(f<=number) {
			f =a+b;
			
			if(f>number)
				break;
			
			System.out.print(f+" ");
			a=b;
			b=f;
		}
	}

}
