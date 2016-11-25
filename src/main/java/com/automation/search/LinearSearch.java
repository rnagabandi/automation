package com.automation.search;

public class LinearSearch {

	/*
	 * Check whther given element is present in a given array?
	 * 
	 * if it is unsorted, iterate the array and check?
	 * 
	 * 
	 * TIME COMPLEXITY - O(n)
	 * Space complexity - o(1) 			
	 *
	 * 
	 */
	
	
	public static void main(String[] args) {

		int[] inputArray = { 12, 4, 5, 8, 7, 9, -4 };

		System.out.println("is key found in given array? ###   "
				+ linearSearch(5, inputArray));
		
		System.out.println("is key found in given array? ###   "
				+ linearSearch(99995, inputArray));
		
		System.out.println("is key found in given array? ###   "
				+ linearSearch(59, inputArray));
		
		System.out.println("is key found in given array? ###   "
				+ linearSearch(-87, inputArray));
	}

	public static boolean linearSearch(int key, int[] array) {

		for (int i = 0; i < array.length; i++) {

			if (key == array[i]) {
				return true;
			}

		}

		return false;
	}

}
