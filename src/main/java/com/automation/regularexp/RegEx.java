package com.automation.regularexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
	
	public static void main(String[] args) {
		
		
		
		String text= "raghav12spire542technologies99";
		
		Pattern pattern = Pattern.compile("[0-9]+");
		Matcher matcher = pattern.matcher(text);
		
		int count=0;
		
		while(matcher.find()){
			
			count+=Integer.parseInt(matcher.group());
		}
		
		System.out.println(count);
		
	}
	
	
	/*
	 *  Find the occurances of "ab" in a given String 
	 * 
	 */
	
	
	public void findOccurances(){
		
		int count =0;
		
		Pattern pattern = Pattern.compile("ab");
		
		Matcher matcher =pattern.matcher("ababbbabbbbaaa");
		
		while (matcher.find()) {
			
			System.out.println(matcher.start() + "  "+matcher.end()  + "  " + matcher.group());
			
			count++;
			
		}
		
		
		System.out.println(count);
		
	}

}
