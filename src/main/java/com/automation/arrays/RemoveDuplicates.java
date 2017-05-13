package com.automation.arrays;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 1, 2, 3, 5 ,8,8,9,10,11};
		
		
		BitSet bitSet = new BitSet();
		
		for (int i = 0; i < array.length; i++)			
			if (!bitSet.get(array[i])){ 
				bitSet.set(array[i]);
				System.out.print(" "+array[i]);
			}
		
		
	}
	
	public void solution2(){
		int[] array = { 1, 2, 3, 1, 2, 3, 5 ,8,8,9,10,11};
		int[] newArray = new int[array.length];

		System.out.println(array[0]);
		newArray[0] = array[0];
		int pos = 0;
		boolean isDuplicate = false;

		for (int i = 1; i < array.length; i++) {
			
			isDuplicate = false;
			for (int j = 0; j < newArray.length; j++) {
				if (array[i] == newArray[j]) {
					isDuplicate = true;
				}
			}

			if (!isDuplicate) {
				newArray[++pos] = array[i];
				System.out.println(array[i]);
			}

		}
	}



	public void solution1(){
		
		int[] array = { 1, 2, 3, 1, 2, 3, 5 ,8,8,9,10,11};
		
		Set<Integer> set = new HashSet<Integer>();
		  
		  for(int i=0;i<array.length;i++){ if (set.add(array[i]))
			  System.out.println(array[i]); }
		  
	}
}

  
 


