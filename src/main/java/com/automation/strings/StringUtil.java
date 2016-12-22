package com.automation.strings;

public class StringUtil {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome("madam"));
		System.out.println(isPalindrome("aabaa"));
		System.out.println(isPalindrome("aam"));
		System.out.println(isPalindrome("cvbnhg"));
		System.out.println(isPalindrome("raghav"));
		
	}
	
	public static boolean isPalindrome(String str){
		
		int len=str.length();
		int j=len-1;
		for(int i=0;i<len/2;i++){
			
			if (str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			j--;
		}
		
		
		return true;
	}
	
	
}
