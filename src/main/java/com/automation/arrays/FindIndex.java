package com.automation.arrays;

/**
 * You are given an array of numbers. Find out the array index or position where
 * sum of numbers preceeding the index is equals to sum of numbers succeeding
 * the index. - See more at:
 * http://www.java2novice.com/java-interview-programs/find
 * -middle-index/#sthash.I41VgRU9.dpuf*
 */
public class FindIndex {

	
	
	public static void main(String[] args) {
		
		int[] array = {1,12,9,3,4,5,5,7,7,9,0,0,0,0,1};
		
		findIndex(array);
		
	}

	private static void findIndex(int[] array) {
		
		if (array==null) {
			System.out.println("array is empty");
		}else if (array.length==1) {
			System.out.println("array has only one element");
		}else{
			
			int i=1,j=array.length-1,leftArraySum=array[0],rightArraySum=0;
			
			while(i<j){
				
				if (leftArraySum>rightArraySum) {
					
					rightArraySum+=array[j];
					j--;
					
				}else{
					
					leftArraySum+= array[i];
					i++;
					
				}
				
				if (leftArraySum == rightArraySum) {
					
					if (j-i == 0) {
						System.out.println("index of the array is : "+ (i+1));
						break;
					}else{
						
						leftArraySum+=array[i];
						i++;
						
					}
					
				}
				
			}
			
			
			
		}
		
		
	}
	
}
