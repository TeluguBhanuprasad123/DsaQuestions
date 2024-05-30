package com.bhanu.www.arrays;

public class Ex1 {

	public static void main(String[] args) {

		
		LL list=new LL();
		list.insertFirst(1);
		
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertFirst(4);
		list.insertFirst(5);

		list.insertLast(99);
		
		list.display();
		
		list.Index(101, 4);
		list.display();
		list.deleteFirst();
		list.display();
		list.deleteLast();
		list.display();
		
		list.deleteAtIndex(3);
		
		list.display();
		
	}

}
