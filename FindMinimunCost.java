package com.bhanu.www.arrays;

import java.util.List;

public class FindMinimunCost {
	
	
	public static int findMinimumTotalCost(List<Integer> arr) {
        
		 int n = arr.size();
		    int minCost = 0;

		    for (int i = 1; i < n; i++) {
		        int diff = arr.get(i) - arr.get(i - 1);
		        minCost += Math.abs(diff);
		    }

		    return minCost;
	}
	public static void main(String[] args) {
     List<Integer> numbers=List.of(5,1,2,3,1,2);
     
    int ans=  findMinimumTotalCost(numbers);
    
    System.out.println(ans);
    		
	}

}
