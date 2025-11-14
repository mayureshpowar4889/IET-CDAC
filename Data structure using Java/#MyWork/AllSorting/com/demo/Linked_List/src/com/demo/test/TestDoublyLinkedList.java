
package com.demo.test;

import java.util.Scanner;

import com.demo.linkedlists.DoublyLinkedList;

public class TestDoublyLinkedList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList dlist = new DoublyLinkedList();

        while(true) {
            System.out.println("=======DoublyLinkedList=========\n");
            System.out.println("1.Add Node at End");
            System.out.println("2.Add Node at Position");
            System.out.println("3.Add Node After Value");
            System.out.println("4.Delete by Value");
            System.out.println("5.Delete by Position");
            System.out.println("6.Display Data");
            System.out.println("7.Display Reverse");
            System.out.println("8.Exit\nEnter choice :");
            int ch = sc.nextInt();

            switch (ch){
                case 1 ->{
                    System.out.println("Enter value to add at end");
                    int val = sc.nextInt();
                    dlist.addNode(val);
                    dlist.displayData();
                }
                case 2 ->{
                    System.out.println("Add Node at Position");
                    System.out.println("Enter position");
                    int pos = sc.nextInt();
                    System.out.println("Enter value");
                    int val = sc.nextInt();
                     dlist.addByPosition(pos, val);
                    dlist.displayData();
                }
                case 3 ->{
                    System.out.println("Add Node After Value");
                    System.out.println("Enter value after which to add");
                    int num = sc.nextInt();
                    System.out.println("Enter value to add");
                    int val = sc.nextInt();
                   dlist.addByValue(val, num);
                    dlist.displayData();
                }
                case 4 ->{
                    System.out.println("Enter Value to Delete");
                    int val = sc.nextInt();
//                    dlist.deleteByValue(val);
                    dlist.displayData();
                }
                case 5 ->{
                    System.out.println("Enter position to Delete (1-based)");
                    int pos = sc.nextInt();
//                    dlist.deleteByPosition(pos);
                    dlist.displayData();
                }
                case 6 ->{
                    System.out.println("Doubly Linked List :");
                    dlist.displayData();
                }
                case 7 ->{
                    System.out.println("Doubly Reverse Linked List :");
                   dlist.displayDataReverse();
                    
                }
                case 8 ->{
                    System.out.println("Byeeeeeee");
                    sc.close();
                    System.exit(0);
                }
                default ->{
                    System.out.println("Invalid Choice !!!!!");
                }
            }
        }
    }
}