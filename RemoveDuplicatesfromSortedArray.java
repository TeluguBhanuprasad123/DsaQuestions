package com.bhanu.www.arrays;

public class RemoveDuplicatesfromSortedArray {
	
	 public static int removeDuplicates(int[] nums) {
	        if (nums.length == 0) {
	            return 0;
	        }
	        
	        int k = 1; // Number of unique elements
	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] != nums[i - 1]) {
	                nums[k++] = nums[i];
	            }
	        }
	        
	        return k;
	    }
	 
	 public static void main(String[] args) {
		int[] ns= {0,0,1,1,1,2,2,3,3,4};
	 int sa	=RemoveDuplicatesfromSortedArray.removeDuplicates(ns);
	 System.out.println(sa);
	}

}
