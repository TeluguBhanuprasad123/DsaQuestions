package com.bhanu.www.arrays;

public class FindUniuqr {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 3, 4, 2, 6, 4 };
		System.out.println(ans(arr));

	}

	private static int ans(int[] arr) {
		int unqiue = 0;
		for (int n : arr) {
			unqiue ^= n;
		}
		return unqiue;
	}

}
