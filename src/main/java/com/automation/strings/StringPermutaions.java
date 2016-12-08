package com.automation.strings;

public class StringPermutaions {
	
	
	public static void permutations(String text){
		
		int len = text.length();
		char[] array = new char[len];
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = text.charAt(i);
			
		}
		
		permutations(array, len);
	}
	
	public static void swap(char[] array,int i , int j){
		
		char temp=array[i];
		array[i]=array[j];
		array[j]=temp;
		
	}
	
	public static void permutations(char[] array,int length){
		
		if (length==1) {
			System.out.println(array);
			return;
		}
		
		for (int i = 0; i < array.length; i++) {
			
			swap(array, i,length-1);
			permutations(array, length-1);
			swap(array, i, length-1);
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		permutations("abcd");
		
	}
	
	
	

}
