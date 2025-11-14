package com.demo.hashing;

import java.awt.HeadlessException;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class HashingTable {
	Node[] head;
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	public HashingTable() {
		head = new Node[10];
		for (int i = 0; i < head.length; i++) {
			head[i] = null;
		}
	}
	
	public HashingTable(int size) {
		head = new Node[size];
		for (int i = 0; i < head.length; i++) {
			head[i] = null;
		}
		
	}
	

	public void displayHashTable() {
		for (int i = 0; i < head.length; i++) {
			Node temp = head[i];
			System.out.print(i + "---->");
			while(temp != null) {
				System.out.print(temp.data + "---->");
				temp = temp.next;
			}
			System.out.println("null");
		}
		
	}

	public boolean searchData(int num) {
	 
		int pos = num % head.length;
	    Node  temp = head[pos];
	    while(temp!=null) {
	    	if(temp.data==num) {
	    		System.out.println(num+" Found At Position "+ pos);
	    		return true;
	    	}
	    	
	    	temp=temp.next;
	    	
	    }
		
		
		System.out.println(num+" Not Found");
		return false;
		
	}

	public void insertData(int val) {
	    Node newNode = new Node(val);           
	    int pos = val % head.length;               
	    if (head[pos] != null) {                   
	        newNode.next = head[pos];           
	    }
	    head[pos] = newNode;         
	    
	    System.out.println("Added Done.........");
	}


}
