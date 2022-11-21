//4. WAP to count the number of consonants, vowels, special characters in a String.

package com.string.example;

import java.util.Scanner;

public class CountStrings {

	public static void main(String[] args) {
		
		String str = " Hello@0123456789$";
		
		/*
		 * System.out.println("Enter Any Alpha Numric String"); Scanner scan = new
		 * Scanner(System.in); String str = scan.nextLine();
		 */	
		System.out.println("The Original String is : "+str);
		
		System.out.println();
		System.out.println("Display Count ");
		//call the method to perform the count 
		countStrings(str);
		
		
	}
	
	public static void countStrings(String str) {
		
		int vowels =0;
		int consonants=0;
		int digits=0;
		int white_spaces =0;
		int symobls =0;
		
		//str = str.toLowerCase();
		
		for(int i=0; i<str.length();i++) {
			
			char ch = str.charAt(i);			
			
			if(ch== 'a' || ch =='e' || ch == 'i'||ch== 'o' || ch =='u' ||
			   ch== 'A' || ch =='E' || ch == 'I'||ch== 'O' || ch =='U' ) {
				vowels++;
			}else if(ch >= 'a' &&  ch <= 'z' || ch >= 'A' &&  ch <= 'Z') {
				consonants++;
			}else if(ch >= '0' &&  ch <= '9') {
				digits++;
			}else if(ch == ' ') {
				white_spaces++;
			}else {
				symobls++;
			}
			
		}
		
		System.out.println("Vowels	  	: "+vowels);
		System.out.println("consonants	: "+consonants);
		System.out.println("digits		: "+digits);
		System.out.println("white_spaces	: "+white_spaces);
		System.out.println("symobls		: "+symobls);
		
		
	}
}
