package com.demo.stacks;



public class MyStackList {

	
	Node top;
	
	class Node{
		int data;
		Node next;
		public Node(int data) {
			
			this.data = data;
			next=null;
		}
		
	}

	public MyStackList() {
	
		this.top = null;
	}
	
	public void push(int num) {
		Node newNode =new Node(num);
		
		if(!isEmpty()) {
			newNode.next = top;
			
		}
		top = newNode;
		System.out.println("Pushed..... "+num);
	}
	
	public int pop() {
		if(!isEmpty()) {
			Node temp = top;
			top = top.next;
			temp.next=null;
			System.out.println("popped.......");
			return temp.data;
		}else {
			System.out.println("Stack Is Empty ");
			return -1;
		}
	}

	private boolean isEmpty() {
		
		return top == null;
	}

	public void display() {
		Node temp = top;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println("null\n");
		
	}
	
}
