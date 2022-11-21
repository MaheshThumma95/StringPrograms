package com.string.example;

public class UniqueCharacters {

	public static void main(String[] args) {
		String str = "Master";
		System.out.println("The Given String is : "+str);
		boolean isUnique = checkUnique(str);
		if(isUnique) {
			System.out.println("All Characters has unique");
		}else {
			System.out.println("Your String has not unique");
		}
	}

	private static boolean checkUnique(String str) {
			
		if(str!=null) {
			for(int i=0;i<str.length();i++) {
				
				for(int j=i+1;j<str.length();j++) {
					if(str.charAt(i)==str.charAt(j)) {
						return false;
					}
				}
				
			}

		}
		return true;
		
	}

}
