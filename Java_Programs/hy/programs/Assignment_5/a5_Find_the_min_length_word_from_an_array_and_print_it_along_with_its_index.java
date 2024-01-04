package Assignment_5;

import java.util.Arrays;
import java.util.Scanner;

public class a5_Find_the_min_length_word_from_an_array_and_print_it_along_with_its_index {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Please Enter the Array Size : ");
		int arrSize = scanner.nextInt(); 
		
		String[] arr = new String[arrSize];
		
		System.out.println("Please Enter the Array Values : ");
	
		for(int i=0; i<arrSize; i++) 
		{
			arr[i] = scanner.next();
		}
		
		System.out.println("Input : " + Arrays.toString(arr)); 
		
		/*
		 * int largestNumber = arr[0]; --> ela anduku tisukunamu antea manam array lo una values ani 
		   compare cheasi aa largestNumber ni print chaiyali, ala compare chaiyali antea manam default 
		   ga largestNumber aneadi manam echina array lo 1st value anukundam, danikosam arr[0] ani 
		   rasam.
		 * int largestNumberIndex = 0; --> ela nduku rasam antea manam paina comparison kosam array lo
		   1st value tisukunam kada obvious ga aa 1st value yoka index "0" anduku ala tisukunam.
		   
		   String minLengthWord = arr[0];
		   int minLengthIndex = 0;
		
		   int largestNumber = arr[0];
		   int largestNumberIndex = 0;
		   
		   same indaka program la compare cheasi cheeadamu. paina 2 statements ki aa paina 2 statements
		   ki saripoendi.
		   
		================================================================================================ 
		  
		 * arr[i]>largestNumber (or) largestNumber<arr[i] --> e renditilo manam ala echina em kadu.
		  
		 * minLengthWord.length() > arr[i].length() (or) arr[i].length() < minLengthWord.length() --> e 
		   renditilo manam ala echina em kadu.
		   
		   same indaka program la compare cheasi cheeadamu. paina 2 statements ki aa paina 2 statements
		   ki saripoendi.
		   
		================================================================================================ 
		 
	    for(int i=0; i<arr.length; i++) // manam echina array looping kosam e for loop.
		{
			if(minLengthWord.length() > arr[i].length()) // manam echina array lo largest number kosam
			{
				minLengthWord = arr[i];
				minLengthIndex = i;
			}	
		}
		
		for(int i=0; i<arr.length; i++) // manam echina array looping kosam e for loop.
		{
			if(largestNumber<arr[i]) // manam echina array lo largest number kosam
			{
				largestNumber = arr[i];
				largestNumberIndex = i;
			}	
		}
		
		   same indaka program la compare cheasi cheeadamu. paina for loop ki aa paina for loop
		   ki saripoendi.
		   
	================================================================================================ 
		 */	
		
		String minLengthWord = arr[0];
		int minLengthIndex = 0;
		
		for(int i=0; i<arr.length; i++) // manam echina array looping kosam e for loop.
		{
			if(minLengthWord.length() > arr[i].length()) // manam echina array lo largest number kosam
			{
				minLengthWord = arr[i];
				minLengthIndex = i;
			}	
		}
		
		System.out.println("Minimum Length Word is --> " + minLengthWord);
		System.out.println("Minimum Length Word Index is --> " + minLengthIndex);
		
		scanner.close(); 
	}

}
