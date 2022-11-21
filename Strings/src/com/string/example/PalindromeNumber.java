//3. WAP to check if “2552” is palindrome or not.
package com.string.example;

import java.util.Scanner;

public class PalindromeNumber {

	
	public static void main(String[] args) {
		
		int num = 2552;
		/*System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();*/
		System.out.println("The Given Number is :"+num);
		checkPalindromeNumber(num);
		 
	}

	private static void checkPalindromeNumber(int n) {
		
		int originaNumber = n;

		int reverse = 0;
		int rem = 0;
	
		while (n!=0) {
			rem =n % 10;
			reverse = reverse * 10 + rem;
			n= n/10;
		}
			
		
		if(originaNumber==reverse) {
			System.out.println(originaNumber+" is a Palindrome Number");
		}else {
			System.out.println(originaNumber+ " is Not a Palindrome Number");
		}
	}

}
