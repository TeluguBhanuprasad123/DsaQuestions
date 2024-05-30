package com.bhanu.www.arrays;

public class LinearSerach {

	public static void main(String[] args) {
	
		int[] arr1= {1,2,3,4,5};
		int target=4;
		boolean flag=true;
		
		for(int i=0;i<=arr1.length-1;i++) {
			if(arr1[i]==target) {
				System.out.println("Tagert is Present at Index ->"+arr1[i]);
				flag=false;
				break;
			}
			
			
		}
		if(flag==true) {
			System.out.println("Target is not Present at index");
		}
		

	}

}
