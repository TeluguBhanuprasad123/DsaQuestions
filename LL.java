package com.bhanu.www.arrays;

public class LL {

	private Node head;
	private Node tail;
	private int size;

	public LL() {
		this.size = 0;
	}

	// InsertFirst
	public void insertFirst(int val) {
		Node node = new Node(val);

		node.next = head;
		head = node;

		if (tail == null) {
			tail = head;
		}

		size += 1;
	}

	// InsertLast
	public void insertLast(int val) {
		if (tail == null) {
			insertFirst(val);
			return;
		}

		Node node = new Node(val);
		tail.next = node;
		tail = node;

		size++;

	}

	// Print all elements
	public void display() {
		Node temp = head;
		System.out.print("[");
		while (temp != null) {
			System.out.print(temp.val);
			temp = temp.next;
			if (temp != null) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	// Insert at Index
	public void Index(int val, int index) {

		if (index == 0) {
			insertFirst(val);
			return;
		}

		if (index == size) {
			insertLast(val);
			return;
		}

		Node temp = head;

		for (int i = 1; i <= index; i++) {
			temp = temp.next;
		}

		Node node = new Node(val, temp.next);
		temp.next = node;
		size++;

	}
	
	//findValue
	public Node findValue(int value) {
		
		Node node=head;
		
		while(node!=null) {
			if(node.val==value) {
				return node;
			}
			node =node.next;
		}
		return null;
		
	}

	// delete first
	public int deleteFirst() {

		int vaal = head.val;

		head = head.next;

		if (head == null) {
			tail = null;
		}
		size--;
		return vaal;

	}

	
	//getElemenet based on Index
	public Node get(int index) {

		Node node = head;

		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;

	}

	// deleteLast
	public int deleteLast() {
		if (size <= 1) {

			return deleteFirst();
		}

		Node secondList = get(size - 2);
		int val = tail.val;
		tail = secondList;
		tail.next = null;

		return val;

	}
	
	//delete at Index
	public int deleteAtIndex(int index) {
		if(index==0) {
			return deleteFirst();
		}
		if(index==size-1) {
			return deleteLast();
		}
		
		Node prev=get(index-1);
		int val=prev.next.val;
		
		prev.next=prev.next.next;
		
		return val;
	}
	
	
	
	

	private class Node {
		private int val;
		private Node next;

		public Node(int val) {
			super();
			this.val = val;
		}

		public Node(int val, Node next) {
			super();
			this.val = val;
			this.next = next;
		}

	}

}
