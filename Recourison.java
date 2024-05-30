package com.bhanu.www.arrays;

public class Recourison {
	
	public static void main(String[] args) {
		 fun(100);
	}
	
     public static void fun(int n) {
    	  
    	  if(n==0) {
    		  return;
    	  }
    	
    	  fun(n-1);
    	  
    	  
    	  
    	  System.out.println(n);
      }

}
