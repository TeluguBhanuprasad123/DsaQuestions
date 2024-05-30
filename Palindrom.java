package com.bhanu.www.arrays;

import java.util.Scanner;

public class Palindrom {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n=sc.nextInt();
	
      int rev=0,originalNumber=n;
      while(n!=0) {
    	  int rem=n%10;
    	  rev=rev*10+rem;
    	   n/=10;
      }
      if(rev==originalNumber) {
    	  System.out.println("It is Palindrom");
      }
      else {
    	  System.out.println("it is not an Palindrom");
      }
		
	}

}
