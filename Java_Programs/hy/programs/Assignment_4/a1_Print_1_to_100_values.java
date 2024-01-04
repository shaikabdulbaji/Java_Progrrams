package Assignment_4;

import java.util.Scanner;

public class a1_Print_1_to_100_values {

	public static void main(String[] args) {
		
		/*
		 * starting number antea manam a number nunchi start chaiyali ani.
		 * ending number antea manam a number daka end chaiyali ani.
		 
		 * ekada number ani vaka kotha variable tisukovali. e number aneadi change aavuthu untundi.
		 * int number = startingNumber; ele assign chestamu, nduku antea e number a manam console lo 
		   print cheaseadi. simple ga e number anea dani increment kosam use chestamu.
		 * number<=endingNumber manam ela manam echina number ending number kana taku unda leada ani 
		 chusukuntamu.
		 
		edanta leakunda ele kuda cheasukovachu :
		System.out.println("Please Enter the Starting Number : ");		
		int startingNumber = scanner.nextInt();
		
		System.out.println("Please Enter the Ending Number : ");		
		int endingNumber = scanner.nextInt();
				
		while(startingNumber<=endingNumber)
		{
			
			System.out.println(startingNumber);
			startingNumber++;
			
		}
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter the Starting Number : ");		
		int startingNumber = scanner.nextInt();
		
		System.out.println("Please Enter the Ending Number : ");		
		int endingNumber = scanner.nextInt();
				
		for(int i=startingNumber; i<=endingNumber; i++ ) //i optional i replace with number it's our wish
			System.out.println(i);
		
		scanner.close();
		
	}

}
