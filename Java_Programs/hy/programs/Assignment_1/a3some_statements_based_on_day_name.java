package Assignment_1;

import java.util.Scanner;

public class a3some_statements_based_on_day_name {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please Enter the Day Name : ");
		
		String dayName = scanner.next();
		
		if(dayName.equals("monday") ||
			dayName.equals("tueday") ||
			dayName.equals("wedday") ||
			dayName.equals("thuday") ||
			dayName.equals("friday"))
			System.out.println("uff, It's a Weekday");
		else if(dayName.equals("satday") ||
				dayName.equals("sunday"))
			System.out.println("yaa, It's a Weekend");
		
		
		scanner.close();
	}

}
