package com.bhanu.www.arrays;

public class Factorial {

	public static void main(String[] args) {
		int ans = fact(5);
		System.out.println(ans);

		
		// This normal way to find Factorial of Number
		int n = 5;
		int factw = 1;
		for (int i = n; i > 0; i--) {
			factw = factw * i;

		}
		System.out.println("Product of all digits=>" + factw);

	}

	
	//Using Recusrison we can find the factorial
	private static int fact(int i) {
		if (i <= 1) {
			return 1;
		}
		return i * fact(i - 1);
	}

}
