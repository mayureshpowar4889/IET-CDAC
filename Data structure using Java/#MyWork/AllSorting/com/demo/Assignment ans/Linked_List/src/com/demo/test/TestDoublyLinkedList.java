package com.demo.test;

import java.util.Scanner;
import com.demo.linkedlists.DoublyLinkedList;

public class TestDoublyLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList dlist = new DoublyLinkedList();

        while (true) {
            System.out.println("======= doubly linkedlist menu ========");
            System.out.println("1. Add Node at End");
            System.out.println("2. Add Node at Position");
            System.out.println("3. Add Node After Value");
            System.out.println("4. Add Node Before Value");   
            System.out.println("5. Delete by Value");
            System.out.println("6. Delete by Position");
            System.out.println("7. Display ");
            System.out.println("8. Display Reverse (Iterative)");
            System.out.println("9. Display Reverse (Recursive)");
            System.out.println("10. Exit");
            System.out.print("Enterchoice: ");
            
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> {
                    System.out.print("Enter value to add at end: ");
                    int val = sc.nextInt();
                    dlist.addNode(val);
                    dlist.displayData();
                }

                case 2 -> {
                    System.out.print("Enter position : ");
                    int pos = sc.nextInt();
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    dlist.addByPosition(pos, val);
                    dlist.displayData();
                }

                case 3 -> {
                    System.out.print("Enter value after which to add: ");
                    int after = sc.nextInt();
                    System.out.print("Enter value to add: ");
                    int val = sc.nextInt();
                    dlist.addAfterValue(val, after);  
                    dlist.displayData();
                }

                case 4 -> {
                    System.out.print("Enter value before which to add: ");
                    int before = sc.nextInt();
                    System.out.print("Enter value to add: ");
                    int val = sc.nextInt();
                    dlist.addBeforeValue(val, before);  
                    dlist.displayData();
                }

                case 5 -> {
                    System.out.print("Enter value to delete: ");
                    int val = sc.nextInt();
                    dlist.deleteByValue(val);
                    dlist.displayData();
                }

                case 6 -> {
                    System.out.print("Enter position to delete : ");
                    int pos = sc.nextInt();
                    dlist.deleteByPosition(pos);
                    dlist.displayData();
                }

                case 7 -> {
                    System.out.println("Doubly Linked List :");
                    dlist.displayData();
                }

                case 8 -> {
                    System.out.println("Doubly Linked List :");
                    dlist.displayDataReverse();
                }

                case 9 -> {
                    System.out.println("Doubly Linked List :");
                    dlist.displayReverseRecursive();
                }

                case 10 -> {
                    System.out.println("Byeeeeeee! Thank you ");
                    sc.close();
                    System.exit(0);
                }

                default -> {
                    System.out.println("Invalid Choice!.\n");
                }
            }
            System.out.println(); 
        }
    }
}