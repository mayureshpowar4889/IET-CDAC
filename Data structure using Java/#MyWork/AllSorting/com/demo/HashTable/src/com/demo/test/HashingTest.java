package com.demo.test;

import java.util.Scanner;

import com.demo.hashing.HashingTable;

public class HashingTest {
	public static void main(String[]args) {
		HashingTable ht = new HashingTable(5);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("==============Hashing table===========");
            System.out.println("1. Insert Number");
            System.out.println("2. Display Hash Table");
            System.out.println("3. Search Number");
            System.out.println("4. Exit");
            System.out.print("Enter choice ");
            
            int ch = sc.nextInt();
            
            
            switch (ch) {
			case 1-> {
				System.out.println("Enter value");
				int val = sc.nextInt();
				ht.insertData(val);
			}
			case 2->{
				ht.displayHashTable();
			}
			
			case 3->{
				System.out.println("Enter value for ");
				int val = sc.nextInt();
				
				ht.searchData(val);
				
				
			}
			case 4->{
				System.out.println("Thnak u!!!");
				System.exit(0);
			}
			default ->{
				System.out.println("Invalid choice");
				
			}
			}
		}
		
	
	}
	

}
