package com.bhanu.www.arrays;

public class OddEvem {

	public static void main(String[] args) {

		int n = 2;

		System.out.println(isOdd(n));

	}

	private static boolean isOdd(int n) {

		return (n & 1) == 1;
	}

}
