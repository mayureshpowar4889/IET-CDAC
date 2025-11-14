
package com.demo.test;

import java.util.Scanner;
import com.demo.linkedlists.DoublyCircularLinkedList;

public class TestDoublyCircularLinkedList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyCircularLinkedList dclist = new DoublyCircularLinkedList();

        while (true) {
            System.out.println("\n====== Doubly Circular Linked  ==========\n");
            System.out.println("1.Add Node at End");
            System.out.println("2.Add Node at Position");
            System.out.println("3.Add Node After Value");
            System.out.println("4.Delete by Value");
            System.out.println("5.Delete by Position");
            System.out.println("6.Display ");
            System.out.println("7.Display Reverse");
            System.out.println("8.Exit");
            System.out.print("\nEnter choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> {
                    System.out.print("Enter value to add at end: ");
                    int v = sc.nextInt();
                    dclist.addNode(v);
                    dclist.displayData();
                }
                case 2 -> {
                    System.out.print("Enter position 1-based: ");
                    int pos = sc.nextInt();
                    System.out.print("Enter value: ");
                    int v = sc.nextInt();
                    dclist.addByPosition(pos, v);
                    dclist.displayData();
                }
                
                case 6 -> dclist.displayData();
               
                case 8 -> {
                    System.out.println("Byeeeeeee!");
                    
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice! ");
            }
        }
    }
}