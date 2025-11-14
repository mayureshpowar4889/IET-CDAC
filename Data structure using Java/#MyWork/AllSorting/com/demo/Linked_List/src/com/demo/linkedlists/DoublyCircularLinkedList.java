
package com.demo.linkedlists;

public class DoublyCircularLinkedList {

    private Node head;

    
    private class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = this.prev = null;
        }
    }

   
    public DoublyCircularLinkedList() {
        head = null;
    }

    // Add at end ================
    public void addNode(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            head.next = head.prev = head;
            return;
        }

        Node tail = head.prev;               
        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = head;
        head.prev = newNode;
    }

    //addByPosition=================
    public void addByPosition(int pos, int val) {
        if (pos < 1) {
            System.out.println("Position must be >= 1");
            return;
        }
        if (head == null) {
            if (pos == 1) {
                addNode(val);
                return;
            }
            System.out.println("List is empty – cannot insert at position " + pos);
            return;
        }

        Node newNode = new Node(val);
        if (pos == 1) {                    
            Node tail = head.prev;
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
            return;
        }

        Node temp = head;
        int i = 1;
        while (temp.next != head && i < pos - 1) {
            temp = temp.next;
            i++;
        }

        if (i == pos - 1) {                 
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        } else {
            System.out.println("Given position " + pos + " is beyond the length of the list");
        }
    }

    
    //  Display =======================
    public void displayData() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        System.out.print("List: ");
        do {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        } while (temp != head);
        System.out.println("head");
    }

   
   
}