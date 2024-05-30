package com.bhanu.www.arrays;

import java.util.Stack;

public class StackExample {
	
	public static  void pushatBottom(int data,Stack<Integer> s) {
		
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int top=s.pop();
		
		pushatBottom(data,s);
		s.push(top);
	}
	
	public static void reverse(Stack<Integer> s) {
		if(s.isEmpty()) {
			return;
		}
		int top =s.pop();
		reverse(s);
		pushatBottom(top,s);
	}

	public static void main(String[] args) {

		
		Stack<Integer> num =new Stack<>();
		
	
	
		num.add(1);
		num.add(2);
		num.add(3);
	
		reverse(num);
		
		System.out.println(num);
		
	}

}
