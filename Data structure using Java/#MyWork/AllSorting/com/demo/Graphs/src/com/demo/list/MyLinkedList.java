package com.demo.list;

public class MyLinkedList {

	Node head;
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public MyLinkedList() {
		head = null;
		
	}
	
	public void addEle(int val) {
		Node newNode = new Node(val);
		if(head != null) {
			newNode.next = head;
		}
		head = newNode;
	}
	
	public boolean search(int val) {
		if(head == null) {
			return false;
		}
		else {
			Node temp = head;
			while(temp!=null && temp.data!=val) {
				temp = temp.next;
			}
			if(temp.data == val) {
				return true;
			}
			
		}
		return false;
	}
	
	public int[] getAdjecentMatrix(int[]arr) {
		Node temp = head;
		for(int i = 0; temp!=null && i < arr.length; i++) {
			arr[i] = temp.data;
			temp = temp.next;
			
		}
		return arr;
	}
	
	public void display() {
		Node temp = head;
		if(temp == null) {
				System.out.println("Empty.....");
		}
		else {
			
			while(temp!= null) {
				System.out.println(temp.data + "-->");
				temp = temp.next;
			}
			
			System.out.println("Null");
			System.out.println();
		}
	}
}
