/**
 * 
 */
package com.automation.strings;

import java.util.HashMap;

import com.thoughtworks.selenium.webdriven.commands.IsAlertPresent;

/**
 * @author Raghavender
 *
 */
public class Palindrome {
	
	public static void main(String[] args) {
		
		System.out.println(isPalindrome("raghav"));
		System.out.println(isPalindrome("abba"));
		System.out.println(isPalindrome("madam"));
		System.out.println(isPalindrome("mmaad"));
		
	}
	
	public static boolean isPalindrome(String str){
		
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		for (int i = 0; i < str.length(); i++) {
			
			if (map.get(str.charAt(i))==null){
				map.put(str.charAt(i), 1);
			}else{
				map.remove(str.charAt(i));
			}
			
		}
		
		if(map.size()>1)
		 return false;
		return true;
	}
	
}
