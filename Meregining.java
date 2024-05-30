package com.bhanu.www.arrays;

import java.util.LinkedList;
import java.util.List;

public class Meregining {

	public static void main(String[] args) {
	
		LinkedList<Integer> num= new LinkedList<>();
		
		num.add(1);
		
		num.add(2);
		
		num.add(3);
		
		
		num.add(4);
		
		
		LinkedList<Integer> numbers= new LinkedList<>(num);
		numbers.add(5);
		numbers.add(6);
		
		System.out.println(numbers);
		

	}

}
