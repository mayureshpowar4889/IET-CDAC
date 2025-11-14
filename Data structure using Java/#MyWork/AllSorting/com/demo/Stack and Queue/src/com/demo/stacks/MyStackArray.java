package com.demo.stacks;

public class MyStackArray {
	 
	private int[] arr;
	private int top;
	
	
	
	public MyStackArray() {
		
		arr = new int[10];
		top=-1;
	}
       public MyStackArray(int size) {
		
		arr = new int[size];
		top=-1;
	}
       
       public void push(int num) {
    	   if(!isfull()) {
    		   top++;
    		   arr[top] = num;
    		   System.out.println("Data Addded...... " + num);
    	   }
    	   else {
    		   System.out.println("Stack is full");
    	   }
       }
       
       public int pop() {
    	   if(!isEmpty()) {
    		   int num = arr[top];
    		   top--;
    		   return num;
    	   }
    	   else {
    		   System.out.println("Stack is empty");
    		   return -1;
    	   
       }
    	   
       }
       
       
	private boolean isEmpty() {
	
		return top==-1;
	}
	private boolean isfull() {
		return top == arr.length-1;
	}
	
	public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
       
	
}
