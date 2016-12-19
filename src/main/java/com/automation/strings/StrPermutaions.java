/**
 * 
 */
package com.automation.strings;

/**
 * @author Raghavender
 *
 */
public class StrPermutaions {
	
	public static void main(String[] args) {
		
	permutation("abcd");	
		
	}
	
	public static void permutation(String str) { 
	    permutation("", str); 
	}

	private static void permutation(String permu, String word) {
	    int n = word.length();
	    if (n == 0) System.out.println(permu);
	    else {
	        for (int i = 0; i < n; i++){
	        	//System.out.println("prefix "+permu+" str.charAt(i) "+word.charAt(i)+ " str.substring(0, i) "+ word.substring(0, i) +" str.substring(i+1, n)"+ word.substring(i+1, n));
	            permutation(permu + word.charAt(i), word.substring(0, i) + word.substring(i+1, n));
	        }
	    }
	}
	
}
