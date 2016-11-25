package com.automation.sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int[] array = { 10, 4, 8, -58, 99, 875, -98, 1 };

		sort(array);

	}

	public static void sort(int[] numbers) {

		int temp, len = numbers.length - 1;

		/*
		 * 
		 * 1) outer loop execute n-1 iterations 2) inner loop also execute n-1
		 * iterations 3) n*n times it will iterate *
		 */

		for (int i = 0; i < numbers.length - 1; i++) {

			for (int j = 0; j < len; j++) {

				temp = 0;

				if (numbers[j] > numbers[j + 1]) {
					temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}

			}
			len--;
		}

		for (int i = 0; i < numbers.length; i++) {
			System.out.print("   " + numbers[i]);
		}

	}

}
