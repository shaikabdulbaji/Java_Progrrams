package Assignment_4;

import java.util.Scanner;

public class a6_Prime_numbers  {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter the Number : ");		
		int number = scanner.nextInt();
		
		int noofDividends = 0;
		
		if (number !=1 && number !=2)
		{
			for(int i=1; i<=number; i++) 
			{
				if(number%i == 0)
					noofDividends++;
			}
			
		}
		
		if(noofDividends>2 || noofDividends==0) {
			System.out.println("Not Prime Number");
		}
		else
			System.out.println("Prime Number");	
		
		scanner.close();
	}

}
