package b19Perimeter_of_Rectangle;

import java.util.Scanner;

public class Sample {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Length of Rectangle : ");
		
		int len = scan.nextInt();
		
		System.out.println("Width of Rectangle : ");
		
		int wid = scan.nextInt();
		
		scan.close();
		
		System.out.println("Perimeter of Rectangle is : "+(len+wid)*2);
		
	}

}
