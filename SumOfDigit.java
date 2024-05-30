package com.bhanu.www.arrays;

public class SumOfDigit {
	
	
	public static void main(String[] args) {
		
		int ans=sum(43);
		System.out.println("sum of digits-->"+ans);
		
	}
	
	
	private static int sum(int n) {
		if (n ==0) {
			return 0;
		}
		return (n%10) + sum(n/10);
	}

}
