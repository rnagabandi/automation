package com.automation.sorting;

public class InsertionSort {
	
	/*
	 * Best Case - O(n)
	 * Average and Worst case - O(n2)
	 * 	   
	 */

	public static void main(String[] args) {
		
		int[] array = {12,5,8,-45,-9,-9999,34,5,32,11};
		
		insertionSort(array);
		
	}
	
	public static void insertionSort(int[] numbers){
		
		
		/*
		 * 
		 * 1) Here outer for loop runs for n iterations
		 * 2) inner for loop takes an element and try to place in right place for moving other elements to right side
		 * 3) if array is already sorted , no shifting are required, hence best case is O(n)
		 */
		
		for (int i = 0; i < numbers.length; i++) {
			
			int pos=i;
			
			for (int j = pos-1; j >=0; j--) {
				
				if (numbers[pos] < numbers[j]) {
					
					int temp = numbers[pos];
					numbers[pos]=numbers[j];
					numbers[j]=temp;
					pos--;
					
				}
				
			}
			
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(" "+numbers[i]);
		}
		
		
	}
	
}
