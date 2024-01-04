package Assignment_5;

import java.util.Arrays;
import java.util.Scanner;

public class a4_Find_the_max_number_from_an_array_and_print_it_along_with_its_index {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Please Enter the Array Size : ");
		int arrSize = scanner.nextInt(); 
		
		int[] arr = new int[arrSize];
		
		System.out.println("Please Enter the Array Values : ");
	
		for(int i=0; i<arrSize; i++) 
		{
			arr[i] = scanner.nextInt();
		}
		
		System.out.println("Input : " + Arrays.toString(arr)); 
		
		/*
		 * manam echina array lo a number largest and dani index rendu print chaiyali.
		 * deni kosam manam 2 variables tisukuntam avi entantea largestNumber and largestNumberIndex.
		 
		 * int largestNumber = arr[0]; --> ela anduku tisukunamu antea manam array lo una values ani 
		   compare cheasi aa largestNumber ni print chaiyali, ala compare chaiyali antea manam default 
		   ga largestNumber aneadi manam echina array lo 1st value anukundam, danikosam arr[0] ani 
		   rasam.
		 * int largestNumberIndex = 0; --> ela nduku rasam antea manam paina comparison kosam array lo
		   1st value tisukunam kada obvious ga aa 1st value yoka index "0" anduku ala tisukunam.
		   
		 * arr[i]>largestNumber (or) largestNumber<arr[i] --> e renditilo manam ala echina em kadu.
		 */	
		int largestNumber = arr[0];
		int largestNumberIndex = 0;
		for(int i=0; i<arr.length; i++) // manam echina array looping kosam e for loop.
		{
			if(largestNumber<arr[i]) // manam echina array lo largest number kosam
			{
				largestNumber = arr[i];
				largestNumberIndex = i;
			}	
		}
		
		System.out.println("Largest Number is --> " + largestNumber);
		System.out.println("Largest Number Index is --> " + largestNumberIndex);
		
		scanner.close(); 
	}

}
