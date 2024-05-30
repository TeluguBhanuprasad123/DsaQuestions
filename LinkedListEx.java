package com.bhanu.www.arrays;

public class LinkedListEx {
	Node head;

	private static int size;

	LinkedListEx() {
		this.size = 0;
	}

	static class Node {
		String data;

		Node next;

		public Node(String data) {
			super();
			this.data = data;
			this.next = null;
			size++;

		}

	}

	public void addFirst(String data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;

		}

		newNode.next = head;
		head = newNode;

	}

	public void addLast(String data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;

		}

		Node curreNode = head;
		while (curreNode.next != null) {
			curreNode = curreNode.next;
		}

		curreNode.next = newNode;

	}

	public void printList() {

		if (head == null) {
			System.out.println("List is nUll");
			return;
		}
		Node curreNode = head;
		while (curreNode != null) {
			System.out.println(curreNode.data + "-->");
			curreNode = curreNode.next;
		}

		System.out.println("NULL");

	}

	public void deleteFirst() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		size--;

		head = head.next;
	}

	public void deleteLast() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		size--;

		if (head.next == null) {
			head = null;
			return;
		}
		Node secondLast = head;
		Node lastNode = head.next;
		while (lastNode.next != null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}

		secondLast.next = null;
	}

	public int getSize() {
		return size;
	}

	public void reverseIterate() {

		if (head == null || head.next == null) {
			return;
		}
		Node prevNode = head;
		Node currNode = head.next;

		while (currNode != null) {
			Node nextNode = currNode.next;

			currNode.next = prevNode;

			prevNode = currNode;
			currNode = nextNode;
		}

		head.next = null;
		head = prevNode;
	}

	/*
	 * Recursive Method 
	 * Time complexity - O(n) 
	 * Space complexity - O(1)
	 * 
	 */

	public Node reverseListRecursive(Node head) {
		// empty node || last node or only one node
		if (head == null || head.next == null) {
			return head;
		}

		Node newHead = reverseListRecursive(head.next);

		head.next.next = head;
		head.next = null;
		return newHead;
	}

	public static void main(String[] args) {

		LinkedListEx list = new LinkedListEx();

		list.addFirst("a");
		list.addFirst("b");

		list.addLast("c");
		list.printList();

		System.out.println("***");

		list.reverseIterate();
		list.printList();

		
	}

}
