package com.demo.test;

import java.util.Scanner;
import com.demo.stacks.*;

public class TestMyStackList {

	public static void main(String[] args) {
		
		MyStackList al = new MyStackList();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("========= Stack Menu LIST =========");
			System.out.println("1.push\n2.pop\n3.Display Stack");
			System.out.println("4.exit\nEnter Choice");
			int ch = sc.nextInt();
			switch(ch) {
			
			case 1->{
				System.out.println("Enter Value to push");
				int val=sc.nextInt();
				al.push(val);
			}
			
			case 2->{
				al.pop();
			}
			case 3->{
				al.display();
			}
			case 4->{
				System.out.println("Thnak u!!!!!!!");
				System.exit(0);
			}
			default ->{
				System.out.println("Invalid Choice !!!");
			}
			}
		}
		

	}

}
