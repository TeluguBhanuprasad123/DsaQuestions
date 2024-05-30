package com.bhanu.www.arrays;

import java.util.Arrays;

public class BobblueSort {
	
	public static void main(String[] args) {
		
		int[] arr= {2,3,4,1};
		int temp=0;
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]<arr[j]) {
					 temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		
		}
		 
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
	}

}
