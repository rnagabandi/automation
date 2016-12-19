/**
 * 
 */
package com.automation.strings;

import org.testng.Assert;

/**
 * @author Raghavender
 *
 */
public class Anagram {
	
	public static void main(String[] args) {
		
		
		Assert.assertEquals(getASCIICount("word"), getASCIICount("wodr"),"Strings are not anagrams");
		Assert.assertEquals(getASCIICount("I am Raghav"), getASCIICount("I am Raghav"),"Strings are not anagrams");
		Assert.assertEquals(getASCIICount("My company name is Spire Technogies"), getASCIICount("company name is Spire Technogies My"),"Strings are not anagrams");
		Assert.assertEquals(getASCIICount("word"), getASCIICount("wor"),"Strings are not anagrams");
	}
	
	public static int getASCIICount(String str){
		
		int sum=0;
		
		for (int i = 0; i < str.length(); i++) {
			sum+=str.charAt(i);
		}
		
		System.out.println(sum);
		return sum;
	}
	

}
