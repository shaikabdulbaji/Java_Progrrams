package b28Given_number_is_palindrome;

import java.util.Scanner;

/*
 * palindrom antea number atu reverse cheasina vakea la untadi.
   for eg : 121 (valid)
            111 (valid)
            222 (valid)
            100(Invalid)
 */

public class Sample {
	
	 public static void main(String[] args) {
         
         Scanner scanner = new Scanner(System.in);
            
         System.out.println("Enter any number:");
            
         int originalNum = scanner.nextInt();
                         
         int num = originalNum ;

         int reversedNum = 0;
        
         int reminder;
        
        
             while(num >0) {
                   
               reminder = num % 10;
                   
               num = num / 10;
              
               reversedNum = reversedNum * 10 + reminder;
                   
            }
            
             if(reversedNum == originalNum) {
                   
                   System.out.println("Given number is a palindrome");
                   
            } else {
                   
                   System.out.println("Given number is not a palindrome" );
                   
            }
            
             scanner.close();
            
     }


}
