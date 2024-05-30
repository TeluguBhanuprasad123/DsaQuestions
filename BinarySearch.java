package com.bhanu.www.arrays;

public class BinarySearch {
	
public static void main(String[] args) {
		
//		int[] arr= {1,2,3,4,5};
//		int a=(arr.length+1)/2;
//		System.out.println(a);
		
		
		int[] arr= {32,5,6,7,23,63,3,2,5,66};
		int target=5;
		int ans=binarySearch(arr,target);
		System.out.println(ans);
		
	}
	
	//FISRT FIND THE MIDDLE  ELEMENT
	//TAGERT==> MIDD =>SEARCH IN THE TARGET ELSE SEARCH IN LEFT
	//IF MIDDLE ELEMENT ==TARGET ELEMENT
	
	static int binarySearch(int[] arr,int target) { 
		
		
		int start=0;
		
		int end=arr.length-1;
		
		while(start<=end) {
			
			//find the mid elemenet
			int mid= start+  (end-start)/2;
			
			
			if(target< arr[mid]) {
				end=mid-1;
			}
			else if(target>arr[mid]) {
				start=mid+1;
			}
			else {
				return mid;
			}
			
			
		}
		return -1;
		
		
		
		
		
		
		
		
		
	}

}
