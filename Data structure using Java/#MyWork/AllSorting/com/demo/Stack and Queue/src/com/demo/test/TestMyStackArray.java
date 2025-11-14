package com.demo.test;

import java.util.Scanner;
import com.demo.stacks.*;

public class TestMyStackArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyStackArray sa =  new MyStackArray();

		while(true) {
			System.out.println("Stack Menu Array =========");
			System.out.println("1.push\n2.pop\n3.Display Stack");
			System.out.println("4.exit\nEnter Choice ");
			int ch = sc.nextInt();
			switch(ch) {
			
			case 1->{
				
				System.out.println("Enter Value to push");
				int val=sc.nextInt();
				sa.push(val);
			}
			
			case 2->{
				sa.pop();
			}
			case 3->{
				sa.display();
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
