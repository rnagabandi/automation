package com.automation.sorting;

public class SelectionSort {
	
	public static void main(String[] args) {
		
		int[] array = {12,6,8,-44,-789,44,3,2,5,89}; 
		
		selectionSort(array);
	}
	
	public static void selectionSort(int[] numbers){
		
		
		/*
		 * 
		 * 1) outer loop runs for n iterations
		 * 2) inner loop runs for n-1 iterations 
		 * 3) each time it will find smallest number and place it in proper location
		 * 4) end of outer loop, all elements will be placed in correct locations
		 * 
		 */
		
		
		for (int i = 0; i < numbers.length; i++) {
			
			int pos=0,temp=0;
			
			for (int j = i; j < numbers.length; j++) {
				
				if (i==j) {
					pos=i;
				}
				
				if (numbers[pos] > numbers[j]) {
					pos=j;
				}
				
				
			}
			
			temp=numbers[i];
			numbers[i]=numbers[pos];
			numbers[pos]=temp;
			
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(" "+numbers[i]);
		}
		
	}

}
