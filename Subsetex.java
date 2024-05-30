package com.bhanu.www.arrays;

public class Subsetex {

	public static void main(String[] args) {
//		skip("", "baccdah");
//
//		System.out.println(skips("baccdah"));
//
//		System.out.println(skipApple("bacapplecdah"));
//		
		
		
	//	subseq("","abc");
		
		
		
	}

	static void skip(String p, String up) {
		if (up.isEmpty()) {
			System.out.println(p);
			return;
		}

		char a = up.charAt(0);

		if (a == 'a') {
			skip(p, up.substring(1));

		} else {
			skip(p + a, up.substring(1));
		}

	}

	static String skips(String up) {
		if (up.isEmpty()) {

			return "";
		}

		char a = up.charAt(0);

		if (a == 'a') {
			return skips(up.substring(1));

		} else {
			return a + skips(up.substring(1));
		}

	}

	static String skipApple(String up) {
		if (up.isEmpty()) {

			return "";
		}

		if (up.startsWith("apple")) {
			return skipApple(up.substring(5));

		} else {
			return up.charAt(0) + skipApple(up.substring(1));
		}

	}
	
	
	
	
	
	static void subseq(String p,String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char ch=up.charAt(0);
		
		subseq(p+ch,up.substring(1));
		
		subseq(p,up.substring(1));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
