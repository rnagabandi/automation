package com.automation.sorting;

public class QuickSort {
	
	/*
	 * Best Case and Average - O(nlog(n))
	 * Worst case - O(n2)
	 * 	   
	 */
	public int[] inputArray={10,5,-4,33,88,-754,-9,3,1};
	
	public static void main(String[] args) {
		
		QuickSort sort= new QuickSort();
		
		sort.sort(sort.inputArray);
		
		for (int i = 0; i < sort.inputArray.length; i++) {
			System.out.println(sort.inputArray[i]);
		}
	}

	
	public void sort(int[] inputArray){
		
		if (inputArray==null || inputArray.length==1) {
			System.out.println("sorting is not required as size is null or have only one elemnt");
		}else{
			this.inputArray=inputArray;
			quickSort(0,inputArray.length-1);
		}
		
		
	}


	void quickSort(int lowerIndex, int higherIndex) {
		
		int pivot = inputArray[lowerIndex+(higherIndex-lowerIndex)/2];
		
		int i = lowerIndex;
        int j = higherIndex;
		
		while(i<=j){
			
			 /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */

			
			while(inputArray[i]<pivot){
				i++;
			}
			
			while(inputArray[j]>pivot){
				j--;
			}
			
			if (i<=j) {
				
				int temp = inputArray[i];
				inputArray[i]=inputArray[j];
				inputArray[j]=temp;
				
				i++;
				j--;
			}
			
		}
		
		if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);

		
	}
}
