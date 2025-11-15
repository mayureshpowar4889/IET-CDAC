package com.demo.linkedlists;



public class SinglyLinkedList {
     Node head;
     
		class Node{ 
			int data;
			Node next;
	
			public Node(int data) {
				
				this.data = data;
				next = null;
			}	
		} 

		public SinglyLinkedList() {
			
			head = null;
		}
		
		
		
		//add at end=================================================
		public void addNodeAtend(int val) {
		
		 Node newNode= new Node(val);
		 
		 if(head==null)
		 {
			 head = newNode;
			 
		 }
		 else {
			Node temp= head;
			
			while(temp.next != null)
			{
				temp=temp.next;
			}
			
		    temp.next=newNode;
		    
	 
		}
		 System.out.println("Node Added Succesfully............\n");
			
		}


		//display============================================================
		public void displaylinkedList() {
			if(head==null)
			{
				System.out.println("List Is Empty ");
			}else {
				
				for (Node temp = head; temp!=null ; temp=temp.next) {
					System.out.print(temp.data + " --> ");
				}
				System.out.println("null\n");
			}
			
		}


		//add By Position========================================================
		public void addNodeAtpos(int pos , int val) {
			Node newNode = new Node(val);
			
			if(pos==1)
			{
				newNode.next=head;
				head = newNode;
				
			}else {
				
				Node temp = head;
				for(int i =1 ;  i < pos - 1 && temp!=null; i++)
				{
					temp= temp.next;
				}
				if(temp!=null) {
					newNode.next = temp.next;
					temp.next = newNode;
					System.out.println("Value added at position " + pos);
				}
				else {
					System.out.println("Given positoin out of beyond!!.....");
				}
			}
			
		}


			//Add after Number ==============================================
		public void addAfterNumber(int num, int val) {
			Node newNode = new Node(val);
			Node temp = head;
			while(temp != null && temp.data != num) {
				temp = temp.next;
			}
			if(temp!=null) {
				newNode.next = temp.next;
				temp.next = newNode; 
				System.out.println("Done........");
				
			}
			else {
				System.out.println(num+" Not Found........");
			}
			
		}


		//delete by value======================================================
		public void DeleteByValue(int val) {
			
			if(head.data == val) {
				head = head.next;
				head.next = null;
			}
			else {
				Node temp = head;
				Node prev = null;
				
				while(temp!=null && temp.data != val) {
					prev = temp;
					temp = temp.next;
					
				}
				if(temp != null) {
					prev.next = temp.next;
					temp.next = null;
					System.out.println("Deleted done.........");
				}
				else {
					System.out.println("Values Not Found....");
				}
				
			}
			
		}


		//delete by pos ===================================================
		public void DeleteByPos(int pos) {
			Node temp=head;
			
			if(pos==1) {
				head=temp.next;
				temp.next=null;
			}else {
				Node prev=null;
				for(int i=0;temp!=null && i<pos-1;i++) {
					prev=temp;
					temp=temp.next;
				}
				if(temp!=null) {
					prev.next=temp.next;
					temp.next=null;
				}else {
					System.out.println(pos+ " is beyond the limit");
				}
			}
			
		}

//=========================================================

		// 1. Display in Reverse
	    public void displayReverse() {
	    System.out.println("Reverse :");
	    displayRev(head);
	    System.out.println("null\n");
	    
	    }
	    private void displayRev(Node node) {
			
			if(node==null) {
				return;
			}
			displayRev(node.next);
			System.out.print(node.data + " --> ");
		}



		// 2. Delete All Prime Numbers
	    public void deleteAllPrimes() {
	        if (head == null) {
	            System.out.println("List is empty!");
	            return;
	        }

	        // Delete from head---------------------------------------
	        while (head != null && isPrime(head.data)) {
	            head = head.next;
	        }

	        Node curr = head;
	        Node prev = null;

	        while (curr != null) {
	            if (isPrime(curr.data)) {
	                prev.next = curr.next;
	            } else {
	                prev = curr;
	            }
	            curr = curr.next;
	        }
	        System.out.println("All Prime Numbers Deleted!");
	    }

	    private boolean isPrime(int n) {
	        if (n <= 1) {
	        	return false;           
	        }
	        
	        if (n == 2 || n == 3) {
	        	return true;            
	        }

	        for (int i = 2; i < n; i++) {      
	            if (n % i == 0) {               
	                return false;
	            }
	        }
	        return true;                        
	    }

	    // 3. Reverse the Linked List--------------------------------------
	    public void reverseList() {
	        Node prev = null;
	        Node curr = head;
	        Node next = null;

	        while (curr != null) {
	            next = curr.next;
	            curr.next = prev;
	            prev = curr;
	            curr = next;
	        }
	        head = prev;
	        System.out.println("List Reversed Successfully!");
	    }

	    // 4. Add Before a Given Value-------------------------------------------
	    public void addBeforeValue(int target, int val) {
	        Node newNode = new Node(val);

	        if (head == null) {
	            System.out.println("List is empty! ");
	            head = newNode;
	            return;
	        }

	        if (head.data == target) {
	            newNode.next = head;
	            head = newNode;
	            System.out.println(val + " added before " + target);
	            return;
	        }

	        Node temp = head;
	        while (temp.next != null && temp.next.data != target) {
	            temp = temp.next;
	        }

	        if(temp.next != null) {
	            newNode.next = temp.next;
	            temp.next = newNode;
	            System.out.println(val + " added before " + target);
	        } else {
	            System.out.println(target + " not found! ");
	          
	        }
	    }
	}


	
		
		
		
		
		
		
		
