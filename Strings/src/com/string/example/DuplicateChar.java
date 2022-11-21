//2. WAP to print Duplicates characters from the String.

package com.string.example;

public class DuplicateChar {

	public static void main(String[] args) {
		String str = "Hyderabad";
		
		System.out.println("The Original String is : "+str);
		
		System.out.println();
		//call method for printDuplicateCharacters
		System.out.println("Print The Duplicate Characters From The String: ");
		System.out.println();
		printDuplicateCharacters(str);
		
	
	}
	
	public static void printDuplicateCharacters(String str) {
		
		if(str == null) {
			System.out.println("It is a NULL String");
		}
		
		if(str.isEmpty()) {
			System.out.println("It is a EMPTY String");
		}
		
		if(str.length() == 1) {
			System.out.println("It is a Single Char String");
		}
		
		//logic for print duplication values 
		if(str!=null) {
			int[] count = new int[256];
			
			for(int i=0;i<str.length();i++) {
				count[str.charAt(i)]++;
			}
			
			
			for(int i=0;i<256;i++) {
				if(count[i]>1) {
					System.out.println((char)i+" count =>"+count[i]);
				}
			}
				
		}
		
		
		
	}
}
