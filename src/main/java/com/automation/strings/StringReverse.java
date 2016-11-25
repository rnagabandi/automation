package com.automation.strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

public class StringReverse {

	public static void main(String[] args) {

		//firstDupliacateCharacterInString("abcd efgh ijkl mnop qrst uvwxyz");
		//firstDupliacateCharacterInStringWithoutMap("1211");
		//duplicateCharacters("my name is laasya");
		
		//addTwoStrings("100000000099999999999999999999999999999999999999999999999999999999", "8999999999999999999999999999999999999999999999999");

		
		 displayAlphabesInString(
		 "test123 7 8 9 12tressdfsdf77 test raghu swathi1 LAASYA");
		 //countNumbersInString
		 //("test123 7 8 9 12tressdfsdf77 test raghu swathi1 LAASYA");
		//reverse("My Name is Raghu"); reverseWords("My Name is Raghu");
		 
		
		
		
		
		

	}
	
	/*
	public String test(){
		
		try{
			return null;
		}catch(Exception e){
			
			
			
		}
		
		
	}*/

	public static void displayAlphabesInString(String text) {

		String[] tokens = text.split("[^a-zA-Z]");

		for (int i = 0; i < tokens.length; i++) {
			if (!tokens[i].equalsIgnoreCase("")) {
				System.out.println(tokens[i]);
			}
		}

	}

	public static void countNumbersInString(String text) {

		String[] tokens = text.split("[^1-9]");

		int count = 0;

		for (int i = 0; i < tokens.length; i++) {

			if (!tokens[i].equalsIgnoreCase("")) {
				System.out.println(tokens[i]);
				count += Integer.parseInt(tokens[i]);
			}

		}

		System.out.println("COUNT IS :: " + count);

	}

	public static void reverse(String text) {

		StringBuffer sb = new StringBuffer();

		for (int i = text.length() - 1; i >= 0; i--) {
			sb = sb.append(text.charAt(i));
		}

		System.out.println("reverse String is ## " + sb.toString());

	}

	public static void reverseWords(String text) {

		StringBuilder sb = new StringBuilder();

		String[] tokens = text.split(" ");

		for (int i = tokens.length - 1; i >= 0; i--) {

			sb = sb.append(tokens[i]);

		}

		System.out.println("reverse word is :: " + sb);

	}

	public static void firstDupliacateCharacterInString(String text) {

		if (text == null) {

			System.out
					.println("empty string , so duplicate characters will not exist");

		} else if (text.length() == 0 || text.length() == 1) {

			System.out
					.println("string length is zero or one, so no concept of duplicate characters in a given string");

		} else {

			HashMap<Character, Integer> map = new HashMap<Character, Integer>();

			map.put(text.charAt(0), 1);
			boolean isDupliacte = false;

			for (int i = 1; i < text.length(); i++) {

				if (text.charAt(i) != ' ') {

					if (map.get(text.charAt(i)) == null) {
						map.put(text.charAt(i), 1);
					} else {
						System.out
								.println("FIRST DUPLICATE CHARACTER IN A GIVEN STRING IS :: "
										+ text.charAt(i));
						isDupliacte = true;
						break;
					}

				}

			}
			if (!isDupliacte) {
				System.out
						.println("No duplicate characters found in given String");
			}

		}

	}
	
	public static void firstDupliacateCharacterInStringWithoutMap(String text) {

		if (text == null) {

			System.out
					.println("empty string , so duplicate characters will exist");

		} else if (text.length() == 0 || text.length() == 1) {

			System.out
					.println("string length is zero or one, so no concept of duplicate characters in a given string");

		} else {
			
			boolean isDuplicate=false;
			
			for (int i = 0; i < text.length(); i++) {
				
				if (text.charAt(i)!=' ') {
					
					if (text.substring(i+1).contains(text.charAt(i)+"")) {
						isDuplicate = true;
						System.out.println("DUPLICATE CHARACTER FOUND IN A GIVEN STRING :: "+text.charAt(i));
						break;
					}
					
				}
				
			}
			
			if (!isDuplicate) {
				System.out.println("No duplicate characters found in a given string");
			}
			
		}

	}

	public static void duplicateCharacters(String text){
		
		if (text==null) {
			
			System.out.println("empty string , so duplicate characters will exist");
			
		}else if (text.length()==0 | text.length()==1) {
			
			System.out.println("string length is zero or one, so no concept of duplicate characters in a given string");
		
		}else{
		
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			
			map.put(text.charAt(0), 1);
			
			for (int i = 1; i < text.length(); i++) {
				
				if (map.get(text.charAt(i))==null) {
					map.put(text.charAt(i), 1);
				}else{
					int temp = map.get(text.charAt(i));
					map.put(text.charAt(i),temp+1);
				}
				
				
			}
			
			System.out.println(map);
			
			Set<Character> keys= map.keySet();
			
			Iterator iterator = keys.iterator();
			
			while (iterator.hasNext()) {
				
				Object key = iterator.next();
				
				System.out.println("key is : "+key +" && value is ::"+map.get(key));
				
			}
		}
		
	}
	
	public static void addTwoStrings(String number1,String number2){
		
		Character[] num1Array = new Character[number1.length()];
		Character[] num2Array = new Character[number2.length()];
		
		Integer[] sum=new Integer[number1.length()+number2.length()];
		
		for (int i = number1.length()-1,j=0; i >=0; i--,j++) {
			num1Array[j]=number1.charAt(i);
		}
		
		for (int i = number2.length()-1,j=0; i >=0; i--,j++) {
			num2Array[j]=number2.charAt(i);
		}
		
		int temp=0;
		
		for (int i = 0; i < sum.length; i++) {
			
			int pos1=-1,pos2=-1;
			
			if (i<number1.length()) {
				pos1=Integer.parseInt(num1Array[i]+"");
			}
			
			if (i<number2.length()) {
				pos2=Integer.parseInt(num2Array[i]+"");
			}
			
			if (pos1 ==-1 && pos2 == -1) {
				
				//this condition will occur when first and second array has completed but temp has some value
				if (temp!=0) {
					sum[i]=temp;
				}
				
				break;
			}else{
				
				
				if (pos1 ==-1 && pos2!= -1) {
					
					// this will occur when second array is completed and first array has elements and temp has value
					if (temp!=0) {
						sum[i]=pos2+temp;
						temp=0;
					}else
						sum[i]=pos2;
					
				}else if (pos1 != -1 && pos2 == -1) {
					
					// this will occur when first array is completed and second array has elements and temp has value
					if (temp!=0) {
						sum[i] = pos1+temp;
						temp=0;
					}else
						sum[i] = pos1;
					
				}else{
					
					sum[i]=(pos1+pos2+temp)%10;
					
					// assigning reminder to temp varaible
					if ((pos1+pos2+temp)/10!=0) {
						temp=(pos1+pos2+temp)/10;
					}else{
						temp=0;
					}
					
					
				
				}
				
			}
			
			
			
		}
		
		// print the sum array
		
		for (int i = sum.length-1; i >=0; i--) {
			if(sum[i]!=null)
				System.out.print(sum[i]);
		}
		
	}
	

} 
