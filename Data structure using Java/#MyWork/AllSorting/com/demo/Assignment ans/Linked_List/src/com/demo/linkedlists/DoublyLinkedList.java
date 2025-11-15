package com.demo.linkedlists;

public class DoublyLinkedList {

    Node head;

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }

    public DoublyLinkedList() {
        head = null;
    }

    // 1. Add node at the end=================================================
    public void addNode(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            newNode.prev = temp;
            temp.next = newNode;
        }
        System.out.println("Done............");
    }

    // 2. Display forward======================================================
    public void displayData() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--->");
            temp = temp.next;
        }
        System.out.println("Null\n");
    }

    // 3. Add node at given position =============================================
    public void addByPosition(int pos, int val) {
        Node newNode = new Node(val);
        if (pos == 1) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
            System.out.println(val + " Added at position " + pos);
            return;
        }

        Node temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }

        if (temp != null) {
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next = newNode;
            if (newNode.next != null) {
                newNode.next.prev = newNode;
            }
            System.out.println(val + " Added at position " + pos);
        } else {
            System.out.println(pos + " position is beyond limit..........\n");
        }
    }

    // 4. Display reverse iterative==============================================
    public void displayDataReverse() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        System.out.print("Doubly Reverse Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.prev;
        }
        System.out.println("null\n");
    }

  
    // add node after given value (Assignment) =================================
    public void addAfterValue(int val, int afterValue) {
        Node newNode = new Node(val);
        Node temp = head;

        // Traverse to find the node with 'afterValue'
        while (temp != null && temp.data != afterValue) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value " + afterValue + " not found in the list. Cannot add.\n");
            return;
        }

        // Insert after temp
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;

        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }

        System.out.println(val + " added after " + afterValue + "\n");
    }
    
 

    
    // reverse recursion =====================================================
    public void displayReverseRecursive() {
        System.out.print("Reverse (Recursive): ");
        displayRev(head);
        System.out.println("null\n");
    }

    // Helper for recursive reverse printing
    private void displayRev(Node node) {
        if (node == null) {
            return;
        }
        displayRev(node.next);
        System.out.print(node.data + "-->");
    }

    //  Delete by value ========================================================
    public void deleteByValue(int val) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;

        if (temp.data == val) {
            head = head.next;
            if (head != null) head.prev = null;
            System.out.println(val + " deleted.");
            return;
        }

        while (temp != null && temp.data != val) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println(val + " not found.");
            return;
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }

        System.out.println(val + " deleted.");
    }

    // Delete by position====================================================
    public void deleteByPosition(int pos) {
        if (head == null || pos < 1) {
            System.out.println("Invalid position or empty list.");
            return;
        }

        if (pos == 1) {
            head = head.next;
            if (head != null) head.prev = null;
            System.out.println("Node at position 1 deleted.");
            return;
        }

        Node temp = head;
        for (int i = 1; temp != null && i < pos; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position " + pos + " exceeds list size.");
            return;
        }

        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;

        System.out.println("Node at position " + pos + " deleted.");
    }
    
    
    
    
 // 7. ADD NODE BEFORE GIVEN VALUE==============================================
    public void addBeforeValue(int newVal, int beforeValue) {
        Node newNode = new Node(newVal);
        Node temp = head;

        // Case 1: List is empty
        if (head == null) {
            System.out.println("List is empty. Cannot add before " + beforeValue);
            return;
        }

        // Case 2: Insert before head (i.e., beforeValue is head's data)
        if (head.data == beforeValue) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            System.out.println(newVal + " added before " + beforeValue + "\n");
            return;
        }

        // Case 3: Traverse to find the node with beforeValue
        while (temp != null && temp.data != beforeValue) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value " + beforeValue + " not found. Cannot add before.\n");
            return;
        }

        // Insert before temp
        newNode.next = temp;
        newNode.prev = temp.prev;
        temp.prev = newNode;

        if (newNode.prev != null) {
            newNode.prev.next = newNode;
        }

        System.out.println(newVal + " added before " + beforeValue + "\n");
    }
}