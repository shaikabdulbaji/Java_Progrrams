package b17Area_of_Rectangle;

import java.util.Scanner;

public class Sample {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Length Of Rectangle : ");

		int len = scan.nextInt();
		
		System.out.println("Breath Of Rectangle : ");
		
		int bre = scan.nextInt();
		
		scan.close();
		
		System.out.println("Area Of Rectangle is : "+(len*bre));
	}

}
