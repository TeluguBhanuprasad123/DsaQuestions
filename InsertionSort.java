package com.bhanu.www.arrays;

import java.util.Arrays;
import java.util.Iterator;

public class InsertionSort {
	 /*
	  * Insertion sort we have partically sort the array
	  * sorting is done by part by part
	  * 
	  * it is adapative steps get reducued if array is sort 
	  * no of swaps reduced as compared to bubblesort
	  * 
	  * stable
	  * used for smaller values of N =>works good which 
	  * array is partially sorted 
	  * takes part in hybrid sort algorithms
	  */
	
	
	public static void main(String[] args) {
		
		int[] arr= {5,4,3,2,1};
		
		insertion(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	
	
    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }
	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

}
