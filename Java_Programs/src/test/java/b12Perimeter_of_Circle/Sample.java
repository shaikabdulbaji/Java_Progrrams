package b12Perimeter_of_Circle;

import java.util.Scanner;

public class Sample {
	
	public static void main(String[] args) {
		
		System.out.println(Math.PI);
				
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any Number : ");
		
		int r = scan.nextInt();
		
		System.out.println("Perimeter is : " +(2*(Math.PI)*r));
		
		scan.close();
	}

}
