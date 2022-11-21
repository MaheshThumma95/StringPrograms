package com.string.example;
//8. WAP to find the maximum occurring character in a String.
import java.util.Scanner;

public class MaxOccuranceChar {

	public static void main(String[] args) {
		 String str = "goodboy";
	     System.out.println("Maximum occurred character is " + getMaxOccurredChar(str));
		
	}
	
    
   public  static char getMaxOccurredChar(String str)
    {
	   int maxCount = -1; 
       char maxOccurance = ' '; 
        
	   if(str!=null && !str.isEmpty()) {
		   int count[] = new int[256];
		   
	        for (int i = 0; i < str.length(); i++) {
	            count[str.charAt(i)]++;
	        }
	       	 
	        //count of each character
	        for (int i = 0; i < str.length(); i++) {
	            if (maxCount < count[str.charAt(i)]) {
	            	maxCount = count[str.charAt(i)];
	            	maxOccurance = str.charAt(i);
	            }
	        }   
	   }
        
	   return maxOccurance;
        
    }

}
