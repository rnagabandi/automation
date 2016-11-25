package com.automation.search;

public class BinarySearch {
	
	/*
	 * 
	 * Check whther given element is present in a given sorted array?
	 * 
	 * TIME COMPLEXITY - O(logn)
	 * Space complexity - o(1) 			
	 */
			
			

	public static void main(String[] args) {

		int[] inputArray = { 1, 45, 78, 99, 898, 1243, 5555, 8888 };

		binaySearch(45, 0, inputArray.length, inputArray);
	}

	public static void binaySearch(int key, int low, int high, int[] array) {

		int mid = (low + high) / 2;

		if (array[mid] == key) {
			System.out.println("key found in a given array");
		} else if (array[mid] < key) {
			binaySearch(key, mid + 1, high, array);
		} else {
			binaySearch(key, low, mid, array);
		}

	}

}
