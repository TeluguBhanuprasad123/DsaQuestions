package com.bhanu.www.arrays;

public class MissingNumber {
	
	 public static int findMissingNumber(int[] nums) {
	        int n = nums.length;
	        int i = 0;
	        while (i < n) {
	            int correctIndex = nums[i];
	            if (correctIndex < n && nums[i] != nums[correctIndex]) {
	                int temp = nums[i];
	                nums[i] = nums[correctIndex];
	                nums[correctIndex] = temp;
	            } else {
	                i++;
	            }
	        }

	        for (i = 0; i < n; i++) {
	            if (nums[i] != i) {
	                return i;
	            }
	        }

	        return n;
	    }

	    public static void main(String[] args) {
	        int[] nums = {0, 1, 2, 4};
	        int missingNumber = findMissingNumber(nums);
	        System.out.println("Missing number: " + missingNumber);
	    }

}
