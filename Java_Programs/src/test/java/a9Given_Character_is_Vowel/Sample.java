package a9Given_Character_is_Vowel;

import java.util.Scanner;

public class Sample {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any Character : ");
		
		char cha = scan.next().charAt(0);//next()--> motham string tisukuntadi, charAt(0) --> single word ni tisukuntadi

		scan.close();
		
		boolean isVowel = false;
		
		switch(cha) {
		
		case 'a' : 
		case 'e' : 
		case 'i' : 
		case 'o' : 
		case 'u' :
		case 'A' : 
		case 'E' : 
		case 'I' : 
		case 'O' : 
		case 'U' :  isVowel = false;
		}
		
		if(isVowel)
			System.out.println("Given Character is Vowel");
		else
			System.out.println("Given Character is not a Vowel");
	}

}
