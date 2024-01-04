package b26Reverse_a_String;

import java.util.Scanner;

/*
 * first manm echeastring length 4 anuko
   size = 4-1=3.
   3>=0 true 3 lo em untea adi print iedi.
   malli i-- antea 2
   2>=0 true 2 lo em untea adi print iedi.
   malli i-- antea 1
   1>=0 true 1 lo em untea adi print iedi.
   malli i-- antea 0
   0>=0 true 0 lo em untea adi print iedi.
 */

public class aSample {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Any String : ");
		
		String str = scan.nextLine();
		
		scan.close();
		
		char[] c = str.toCharArray();
		
		String revString = "";
		
		for(int i=c.length-1; i>=0; i--) {
			revString = revString + c[i];
		}
		System.out.println(revString);
		
	}

}
