package com.demo.test;

import java.util.Scanner;



import com.demo.linkedlists.SinglyLinkedList;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);
       SinglyLinkedList slist = new SinglyLinkedList();
       slist.addNodeAtend(10);
       slist.addNodeAtend(56);
       slist.addNodeAtend(14);
       slist.addNodeAtend(20);
       
       while(true)
       {
    	   System.out.println("==========SinglyLinkedList=========\n");
           System.out.println("1.Add Node at End");
           System.out.println("2.Add Node at Position");
           System.out.println("3.Add Node After  Number");
           System.out.println("4.Delete by Value");
           System.out.println("5.Delete by Position\n");
           
           System.out.println("6.Display SinglyLinkedList List");
           System.out.println("7. Display in Reverse");           
           System.out.println("8. Delete All Prime Numbers");    
           System.out.println("9. Reverse the List");             
           System.out.println("10. Add Before Given Value");      
           System.out.println("11. Exit\n");
           System.out.println("Enter choice :");
           int ch = sc.nextInt();
           
           switch(ch)
           {
           case 1->
           {
        	   System.out.println("Enter value to add at end");
        	   int val = sc.nextInt();
        	   slist.addNodeAtend(val);
           }
           case 2->
           {
        	   System.out.println("Add Node at Position");
        	   System.out.println("Enter value");
        	   int val = sc.nextInt();
        	   System.out.println("Enter Position");
        	   int pos = sc.nextInt();
        	   slist.addNodeAtpos(pos,val);
           }
           
           case 3->{
        	   System.out.println("Add Node After  Number");
        	   System.out.println("Enter Number to add after data");
        	   int num = sc.nextInt();
        	   System.out.println("Enter value to add in node");
        	   int val = sc.nextInt();
        	   slist.addAfterNumber(num, val);
           }
           case 4->{
        	   System.out.println("Enter Value to Delete");
        	   int val = sc.nextInt();
        	   slist.DeleteByValue(val);
           }
           case 5->{
        	   System.out.println("Enter position to Delete Value");
        	   int pos = sc.nextInt();
        	   slist.DeleteByPos(pos);
           }
           case 6->
           {
        	   slist.displaylinkedList();
           }
          
           case 7 -> {
        	   slist.displayReverse();                    
           }
           
           case 8 ->{
        	   slist.deleteAllPrimes();                  
           }
           
           case 9 -> {
        	   slist.reverseList();                       
           }
           
           case 10 -> {                                         
               System.out.print("Enter target value (add before): ");
               int target = sc.nextInt();
               System.out.print("Enter value to add: ");
               int val = sc.nextInt();
               slist.addBeforeValue(target, val);
           }
           
           
           case 11 -> {
               System.out.println("Byeeeeeee");
               System.exit(0);
           }
           
           
           
           default ->{
        	   System.out.println("Invalid Choice !!!!!");
           }
           
           }
           
       }
       
	}

}
