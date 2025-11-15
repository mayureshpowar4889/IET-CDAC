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

    // 1. Add Node at End========================================================
    public void addNode(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            head.next = head.prev = head;
        } else {
            Node tail = head.prev;
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
        }
        System.out.println(val + " added at end.");
    }

    // 2. Add Node at Position (1-based)================================================
    public void addByPosition(int pos, int val) {
        if (pos < 1) {
            System.out.println("Position must be >= 1");
            return;
        }

        Node newNode = new Node(val);

        if (head == null) {
            if (pos == 1) {
                addNode(val);
            } else {
                System.out.println("List is empty – cannot insert at position " + pos);
            }
            return;
        }

        if (pos == 1) {
            Node tail = head.prev;
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
            System.out.println(val + " added at position 1");
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
            System.out.println(val + " added at position " + pos);
        } else {
            System.out.println("Position " + pos + " is beyond list length.");
        }
    }

    // 3. Add Node After a Given Value================================================
    public void addAfterValue(int val, int after) {
        if (head == null) {
            System.out.println("List is empty. Cannot add after " + after);
            return;
        }

        Node temp = head;
        do {
            if (temp.data == after) {
                Node newNode = new Node(val);
                newNode.next = temp.next;
                newNode.prev = temp;
                temp.next.prev = newNode;
                temp.next = newNode;
                System.out.println(val + " added after " + after);
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("Value " + after + " not found in the list.");
    }

    // 4. Delete by Value================================================
    public void deleteByValue(int val) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        Node temp = head;

        // Case 1: Only one node
        if (head.next == head && head.data == val) {
            head = null;
            System.out.println(val + " deleted. List is now empty.");
            return;
        }

        // Traverse to find the node
        do {
            if (temp.data == val) {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;

                // If deleting head, update head
                if (temp == head) {
                    head = head.next;
                }
                System.out.println(val + " deleted.");
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println(val + " not found in the list.");
    }

    // 5. Delete by Position (1-based)==============================================
    public void deleteByPosition(int pos) {
        if (head == null || pos < 1) {
            System.out.println("Invalid position or empty list.");
            return;
        }

        if (pos == 1) {
            if (head.next == head) {
                head = null;
            } else {
                Node tail = head.prev;
                head = head.next;
                head.prev = tail;
                tail.next = head;
            }
            System.out.println("Node at position 1 deleted.");
            return;
        }

        Node temp = head;
        int i = 1;
        while (temp.next != head && i < pos) {
            temp = temp.next;
            i++;
        }

        if (i == pos) {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            System.out.println("Node at position " + pos + " deleted.");
        } else {
            System.out.println("Position " + pos + " exceeds list size.");
        }
    }

    // 6. Display Forward====================================================
    public void displayData() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        System.out.print("List (Forward): ");
        do {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        } while (temp != head);
        System.out.println("head\n");
    }

    // 7. Display Reverse=====================================================
    public void displayReverse() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node tail = head.prev;
        Node temp = tail;
        System.out.print("List (Reverse): ");
        do {
            System.out.print(temp.data + "-->");
            temp = temp.prev;
        } while (temp != tail);
        System.out.println("head\n");
    }
}