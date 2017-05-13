package com.automation.problems;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringProblems {
	
	public static void main(String[] args) {
		
		String test = "aabdceaaabbbcd";
		
		Set<Character> set = new LinkedHashSet<Character>();
		
		for (int i = test.length()-1; i >=0; i--)			
			if(set.add(test.charAt(i))==true)
				System.out.print(test.charAt(i));			
				
	}
	
	public void approach1(){
		
		String test = "aabdceaaabbbcd";
		
		Set<Character> set = new LinkedHashSet<Character>();
		
		for (int i = test.length()-1; i >=0; i--) {
			set.add(test.charAt(i));
		}
		
		System.out.println(set);
		
	}

}
