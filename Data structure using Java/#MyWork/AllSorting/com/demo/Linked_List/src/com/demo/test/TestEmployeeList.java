package com.demo.test;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.linkedlists.*;
public class TestEmployeeList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SinglyLinkedListEmployee elist = new SinglyLinkedListEmployee();
		
		int ch;
		
		while(true) {
			System.out.println("\n=========Employee Menu ======");
			System.out.println("1.Add Employee At end\n"
					+ "2.Dsiplay Employee List ");
			System.out.println("3.Add Employee After ID");
	        System.out.println("4.Add Employee By Position");
	        System.out.println("5.Delete Employee By ID");
	        System.out.println("6.Delete Employee By Position");
	        System.out.println("7.Modify Salary By ID");
	        System.out.println("8.Exit");
			System.out.println("Enter Choice :");
			ch=sc.nextInt();
			
			switch(ch) {
			case 1->{
				
				System.out.println("Enter Employee ID");
				int id = sc.nextInt();
				
				System.out.println("Enter Employee Name");
				String ename=sc.next();
				
				System.out.println("Enter Employee Salary");
				Double sal=sc.nextDouble();
				Employee e = new Employee(id,ename,sal); 
				
				elist.addNode(e);
			}
			
			case 2->{
				elist.displayData();
			}
			case 6->{
				System.out.println("Enter position to Delete Employee ");
				int pos = sc.nextInt();
				
				elist.deleteByPosition(pos);
			}
			case 7->{
				System.out.println("Enter  Emp Id ");
				int id=sc.nextInt();
				System.out.println("Enter New Salary");
				double newsal = sc.nextDouble();
				elist.modifysalById(id,newsal);
			}
			case 8->{
				System.out.println("Thank You !!!!!!!!");
				System.exit(0);
				
			}
			default ->
			{
				System.out.println("Invalid Choice !!!");
			}
			
			}
			
		}

	}

}
