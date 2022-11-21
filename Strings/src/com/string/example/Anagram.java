package com.string.example;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "Dusty";   
		String str2 = "Study";
		
		
		str1 = str1.toLowerCase();//.trim();
		str2 = str2.toLowerCase();//.trim();
		checkAnagram(str1, str2);
	}
	
	public static void checkAnagram(String str1, String str2) {
		
		String cpString1 = str1.replaceAll(" ", "");
		String cpString2 = str2.replaceAll(" ", "");
		 
		System.out.println(cpString1+" :  "+cpString2);
		
		//compare str1 and str2 lengths
		if(cpString1.length() == cpString2.length()) {
			
			char[] chArr1 = cpString1.toCharArray();
			char[] chArr2 = cpString2.toCharArray();
			
			Arrays.sort(chArr1);
			Arrays.sort(chArr2);
			
			  
			if(Arrays.equals(chArr1, chArr2)) {
				System.out.println(cpString1 + " and " + cpString2 + " are Anagram.");	
			}else {
				System.out.println(cpString1 + " and " + cpString2 + " are not Anagram.");
			}
			
		}else {
			System.out.println(cpString1 + " and " + cpString2 + " are not Anagram. Because Strings lengths are different!");
		}
	}

}
