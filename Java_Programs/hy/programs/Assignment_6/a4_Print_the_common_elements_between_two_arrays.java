package Assignment_6;

import java.util.Arrays;
import java.util.Scanner;

public class a4_Print_the_common_elements_between_two_arrays {

	public static void main(String[] args) {

		//edi values evataniki - Array1 lo
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Please Enter no.of Rows in array1 : ");
		int rowSize_arr1 = scanner.nextInt();
		
		int[][] arr1 = new int[rowSize_arr1][];
		
		for(int i=0; i<rowSize_arr1; i++)
		{
			System.out.println("Please Enter the Coloumn Size in Row Number : " +i);
			int colSize = scanner.nextInt();
			arr1[i] = new int[colSize];
			
			System.out.println("Please Enter the Coloumn Values for Row Number : " +i);
			for(int j=0; j<colSize; j++)
			{
				arr1[i][j] = scanner.nextInt();
			}
		}
		
		//edi values evataniki - Array2 lo
		System.out.println("Please Enter no.of Rows in array2 : ");
		int rowSize_arr2 = scanner.nextInt();
		
		int[][] arr2 = new int[rowSize_arr2][];
		
		for(int i=0; i<rowSize_arr2; i++)
		{
			System.out.println("Please Enter the Coloumn Size in Row Number : " +i);
			int colSize = scanner.nextInt();
			arr2[i] = new int[colSize];
			
			System.out.println("Please Enter the Coloumn Values for Row Number : " +i);
			for(int j=0; j<colSize; j++)
			{
				arr2[i][j] = scanner.nextInt();
			}
		}
		
		//edeamo arr1 print chaiyataniki
		System.out.println("Input1 : ");
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println(Arrays.toString(arr1[i]));
		}
		
		//edeamo arr2 print chaiyataniki
		System.out.println("Input2 : ");
		for(int i=0; i<arr2.length; i++)
		{
			System.out.println(Arrays.toString(arr2[i]));
		}
		
		
		
		boolean isFound = false;
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr1[i].length; j++)
			{
				int targetElement = arr1[i][j];
				for(int k=0; k<arr1.length; k++)
				{
					isFound = false;
					for(int m=0; m<arr1[i].length; m++)
					{
						if(targetElement == arr2[k][m])
						{
							System.out.println(targetElement);
							isFound = true;
							break;
						}
					}
					if(isFound)
						break;
				}
			}
		}
	
		scanner.close();
	}

}
