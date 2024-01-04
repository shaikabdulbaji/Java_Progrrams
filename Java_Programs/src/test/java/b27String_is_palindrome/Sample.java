package b27String_is_palindrome;

import java.util.Scanner;

/*
 * palindrom antea string atu reverse cheasina vakea la untadi.
   for eg : liril (valid)
            mom (valid)
            madam (valid)
            abdul(Invalid)
 */

public class Sample {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Any String : ");
		
		String str = scan.nextLine();
		
		scan.close();
		
		char[] c = str.toCharArray();
		
		//for reversing text
		int size = c.length;
		
		String revText = "";
		
		for(int i=size-1; i>=0; i--)
		{
			revText = revText + c[i];
		}
		
		//for comparing text
		if(str.equals(revText))
		{
			System.out.println(str +" is palandrome ");
		}else {
			System.out.println(str +" is not a palandrome ");
		}
		
	}

}
