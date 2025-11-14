package com.demo.test;

import java.util.Scanner;

import com.demo.trees.MyBinarySearchTree;

public class TestBinarySearchTree {

	public static void main(String[] args) {
		
		MyBinarySearchTree bst = new MyBinarySearchTree();
		int ch;
		Scanner sc =  new Scanner(System.in);
		
		while(true) {
			System.out.println("\n========Binary Serach Tree Menu =======");
			
			System.out.println("1.Insert Node");
            System.out.println("2.Delete Node");
            System.out.println("3.Search Recursive");
            System.out.println("5.Inorder Traversal");
            System.out.println("6.Preorder Traversal");
            System.out.println("7.Postorder Traversal");

            System.out.println("8.Exit");
            System.out.print("\nEnter choice: ");
            ch = sc.nextInt();
            switch(ch) {
            
            case 1->{
            	
            	System.out.println("Enter Value to add in Binary Serach Tree");
            	int val = sc.nextInt();
            	bst.insertNode(val);
            }
            case 2->{
            	
            }
            case 3->{
            	System.out.println("Enter Value to Search");
            	int key = sc.nextInt();
            	bst.search(key);
            }
            case 4 ->{
            	
            }
            
            case 5->{
            	bst.inorder();
            }
            case 6->{
            	bst.preorder();
            }
            case 7->{
            	bst.postorder();
            }
            case 8->{
            	System.out.println("Thnak u!!!!!!!");
            	System.exit(0);
            	
            }
            default ->{
            	System.out.println("Inavlid Choicee !!!!!");
            }
            }
            
		}

	}

}
