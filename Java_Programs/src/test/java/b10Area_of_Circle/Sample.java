package b10Area_of_Circle;

import java.util.Scanner;

public class Sample {
	
	public static void main(String[] args) {
		
		System.out.println(Math.PI);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Radius");
		
		double r = scan.nextDouble();
		
		scan.close();
		
		System.out.println((Math.PI)*r*r);
		
	}

}
