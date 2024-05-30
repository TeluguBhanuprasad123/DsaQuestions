package com.bhanu.www.arrays;

import java.util.Arrays;

public class Rotatearray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
        
        rotate(arr,3);

      System.out.println(Arrays.toString(arr));

	}

	 static void rotate(int[] arr,int n) {
	        int temp, i, j;
	        for (i = 0; i < n; i++) {
	            temp = arr[arr.length - 1];
	            for (j = arr.length - 1; j > 0; j--) {
	                arr[j] = arr[j - 1];
	            }
	            arr[0] = temp;
	        }
	 }

}
