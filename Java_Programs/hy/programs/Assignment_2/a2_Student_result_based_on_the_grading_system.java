package Assignment_2;

import java.util.Scanner;

public class a2_Student_result_based_on_the_grading_system {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please Enter the First Number : ");
		int num1 = scanner.nextInt();	
		
		System.out.println("Please Enter the Second Number : ");
		int num2 = scanner.nextInt();	
		
		System.out.println("Please Enter the Target Operation : ");
		String operation = scanner.next();

		int result = 0;
		
		switch(operation) {
		
		case "+" :
			result = num1 + num2;
			break;
		
		case "-" :
			result = num1 - num2;
			break;

		case "*" :
			result = num1 * num2;
			break;
			
		case "/" :
			result = num1 / num2;
			break;
			
		case "%" :
			result = num1 % num2;
			break;
			
		default :
			System.err.println(" Invalid Operator !! ");
			break;
	}
		
		System.out.println(result);
		
		scanner.close();
	}

}
