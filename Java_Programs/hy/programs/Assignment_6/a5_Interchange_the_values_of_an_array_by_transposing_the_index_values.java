package Assignment_6;

import java.util.Arrays;
import java.util.Scanner;

public class a5_Interchange_the_values_of_an_array_by_transposing_the_index_values {

	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Please Enter no.of Rows : ");
		int rowSize = scanner.nextInt();
		
		int[][] arr = new int[rowSize][];
		
		for(int i=0; i<rowSize; i++)
		{
			System.out.println("Please Enter the Coloumn Size in Row Number : " +i);
			int colSize = scanner.nextInt();
			arr[i] = new int[colSize];
			
			System.out.println("Please Enter the Coloumn Values for Row Number : " +i);
			for(int j=0; j<colSize; j++)
			{
				arr[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Input : ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(Arrays.toString(arr[i]));
		}
		
		
		int[][] outputArr = new int[arr.length][];
		for(int i=0; i<arr.length; i++)
		{
			outputArr[i] = new int[arr[i].length];
			for(int j=0; j<arr[i].length; j++)
			{
				outputArr[i][j] = arr[j][i];
			}
		}
		
		System.out.println("Output is --> ");
		for(int i=0; i<outputArr.length; i++)
		{
			System.out.println(Arrays.toString(outputArr[i]));
		}
		
		scanner.close();
	}

}
