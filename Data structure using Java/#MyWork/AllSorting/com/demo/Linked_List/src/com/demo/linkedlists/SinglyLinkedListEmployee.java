package com.demo.linkedlists;

import javax.management.modelmbean.ModelMBean;

import com.demo.beans.Employee;
import com.demo.linkedlists.DoublyLinkedList.Node;

public class SinglyLinkedListEmployee {

	
	Node head;
	
	class Node {
		Employee data;
		Node next;
		
		public Node(Employee data) {
			super();
			this.data = data;
			this.next = null;
		}
	
	}

	public SinglyLinkedListEmployee() {
		super();
		head=null;
	}

	public void addNode(Employee e) {
		Node newNode = new Node(e);
		
		  if(head==null) {
			  head=newNode;
			  
		  }else {
			  Node temp = head;
			  
			  while(temp.next!=null) {
				  temp=temp.next;
			  }
			  if(temp!=null) {
				  
				  temp.next= newNode;
				  
			  }
		  }
		System.out.println("Emp Add At End Succesfully !!");
	}

	public void displayData() {
		if(head==null) {
			System.out.println("List Employee Is Empty!");
			
		}else {
			Node temp = head;
			
			while(temp!=null)
			{
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
			
		}
		System.out.println("Null\n");
		
	}

	
	public void modifysalById(int id, double newsal) {
		
		Node temp = head;
		while(temp!=null && temp.data.getEmpno()!=id) {
			temp=temp.next;
		}
		if(temp!=null && temp.data.getEmpno()==id) {
			temp.data.setSal(newsal);
			System.out.println("Salary updated!!!!");
		}else {
			System.out.println("ID Not Found !!!");
		}
	}

	public void deleteByPosition(int pos) {
		Node temp=head;
		if(head!=null) {
			
		if(pos==1) {
			head=temp.next;
			head=null;
			System.out.println("Employee Deleted !!");
		}else {
			
			Node prev = null;
			for(int i=1 ; temp!= null && i<pos-1;  i++ ){
				prev=temp;
				temp=temp.next;
			}
			if(temp!=null) {
				prev.next=temp.next;
				temp.next=null;
				System.out.println("Employee Deleted !!");
			}else {
				System.out.println("position Beyound Limit !!!");
			}
		}
		
		}else {
			System.out.println("List Is Empty!!!!!");
		}
	}
	
	
	
	
	
}
