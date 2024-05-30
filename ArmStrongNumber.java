package com.bhanu.www.arrays;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int[] arr = { 153, 8, 9, 89, 370, 438 };
		for (int i = 0; i <= arr.length - 1; i++) {
			int originalNumber = arr[i];
			int count = 0;
			double result = 0;

			while (arr[i] != 0) {
				count++;
				arr[i] /= 10;
			}
			arr[i] = originalNumber;
			while (arr[i] != 0) {
				int rem = arr[i] % 10;
				result=Math.pow(rem, count);
				arr[i]/=10;
				
 
			}
			if(result==originalNumber) {
				System.out.println(originalNumber+"   It is OriginalNumber");
			}
			else {
				System.out.println(originalNumber +"  it is not OriginalNumbe");
			}

		}
	}

}
