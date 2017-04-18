package com.automation.problems;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountAlphabet {

	
	public static void main(String[] args) {
		
		
		String input = "abc@@@@";
		
		int i, count;
	    int len = input.length();
	    String initial = "";

	    for (i = 0; i < len; i++) {
	        initial = initial + input.charAt(i);
	        count = 1;
	        while (i + 1 < len && input.charAt(i) == input.charAt(i + 1)) {
	            count++;
	            i++;
	        }
	        initial = initial + String.valueOf(count);
	    }
	    System.out.println(initial);	
		
	}
	
	public void approach2(String str){
		
		StringBuffer output=new StringBuffer();
		
		byte[] bitmap =new byte[65536];
		
		for (int i = 0; i < str.length(); i++)			
			bitmap[str.charAt(i)] = ++bitmap[str.charAt(i)];
		
		
			
		for (int i = 0; i < str.length(); i++)			
			if (output.indexOf(str.charAt(i)+"")==-1) 
				output.append(str.charAt(i)+""+bitmap[str.charAt(i)]);
	
		System.out.println(output);
	}
	
	public void approach1(String str){
		
		HashMap<Character,Integer> map = new LinkedHashMap<Character, Integer>();
		
		for (int i = 0; i < str.length(); i++) {
			
			if(map.containsKey(str.charAt(i))){
				
				int count=map.get(str.charAt(i));
				map.put(str.charAt(i),++count);
				
			}else{
				map.put(str.charAt(i),1);
			}
			
			
		}
		
		System.out.println(map);
		
		for (int i = 0; i < map.size(); i++) {
			
			System.out.print(str.charAt(i)+""+map.get(str.charAt(i)));
			
		}
		
	}
	
}
