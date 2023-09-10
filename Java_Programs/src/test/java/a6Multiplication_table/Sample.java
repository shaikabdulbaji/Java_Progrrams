package a6Multiplication_table;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number : ");

		int a = scan.nextInt();

		for(int i=1; i<=10; i++)
		{
			System.out.println(a+"x"+i+"="+a*i);
		}
		
		
		scan.close();

		
	}
}
