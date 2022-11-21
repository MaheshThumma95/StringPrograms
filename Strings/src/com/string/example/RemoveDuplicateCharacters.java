//Question: 1. WAP to remove Duplicates from a String.(Take any String ex with duplicates character)
package com.string.example;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
	
		String str = "saachhins";   //Take String with duplicate characters
		
		System.out.println("Original String is:"+str);
				
		
		//call remove duplicate method here
		String rmvDupString = removeDuplicates(str);
		
		//Print String After Removing Duplicates characters
		System.out.println("\nAfter Removing Duplicates: "+ rmvDupString);

		
	}
	private static String removeDuplicates(String str) {
		
				
		if(str == null) {
			System.out.println("It is a NULL String");
			return str;
		}
		if(str.isEmpty()) {
			System.out.println("It is a EMPTY String");
			return str;
		}
		
		if(str.length() ==1) {
			System.out.println("It is a Single Char String");
			return str;
		}
		
		String newStr = "";
		
		//logic for remove duplicates
		if(str!=null) {
			
			for(int i=0;i<str.length();i++) {
				
				char ch = str.charAt(i);
				
				int position = newStr.indexOf(ch); 
				if(position == -1) {
					newStr+=ch;  //newStr=newStr+ch; 
				}
			}
					
		}
		return newStr;
			
	}

}
