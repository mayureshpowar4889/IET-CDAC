package com.demo.linkedlists;

public class DoublyLinkedList {

	Node head;
		public class Node{
			int data ;
			Node next;
			Node prev;
			
			public Node(int data) {
				super();
				this.data = data;
				next =null;
				prev = null;
			}
		}
		public DoublyLinkedList() {
			
			head = null;
		}
		
		//addNode======================================
		public void addNode(int val) {
			Node newNode = new Node(val);
			Node temp = head;
			if(head == null) {
				head = newNode;
			}
			else {
				while(temp.next != null) {
					temp = temp.next;
				}
				newNode.prev = temp;
				temp.next = newNode;
				
			}
			System.out.println("Done............");
			
			
		}
		
		
		//displayData===================================
		public void displayData() {
			Node temp = head;
			while(temp!=null) {
				System.out.print(temp.data +"--->");
				temp = temp.next;
			}
			System.out.println("Null\n");
		}
		
		
		//addByPosition========================================
		public void addByPosition(int pos, int val) {
			// TODO Auto-generated method stub
			Node newNode = new Node(val);
			if(pos==1)
			{
				newNode.next=head; 
				
				if(head!=null) {
					head.prev=newNode;
					
				}
				head=newNode;
				
			}else {
				
				Node temp = head;
				for(int i = 1 ;temp!=null && i<pos-1;i++ ) {
					temp=temp.next;
					
				}
				
				if(temp!=null) {
					
					newNode.next=temp.next;
					newNode.prev= temp;
					
					temp.next=newNode;
					if(newNode.next!=null) {
						
						newNode.next.prev=newNode;
						}
					
					System.out.println(val+"Added At position "+pos);
			}else {
				System.out.println(pos+" position is beyound limit..........\n");
				}
			}
		}
		
		//displayDataReverse
		public void displayDataReverse() {
			Node temp= head;
			if(head==null)
			{
				System.out.println("Empty List");
			}else {
			while(temp.next!=null) {
				temp=temp.next;
				
			}
			
			while(temp!=null)
			{
				System.out.print(temp.data+"-->");
				temp=temp.prev;
			}
		}
			System.out.println("null");
			
		}

		public void addByValue(int val, int num) {
			
			
			Node newNode=new Node(val);
			Node temp=head;
			while(temp!=null && temp.data!=num) {
				temp=temp.next;
				
			}
			
			if(temp!=null) {
				newNode.next=temp.next;
				
			}
			
		}
		
		
		
		
		
	
		
}
