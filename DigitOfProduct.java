package com.bhanu.www.arrays;

public class DigitOfProduct {

	public static void main(String[] args) {
		int ans=prod(22);
		System.out.println("sum of digits-->"+ans);
		

	}
	
	private static int prod(int n) {
		if (n ==0) {
			return 0;
		}
		return (n%10) * prod(n/10);
	}

}
