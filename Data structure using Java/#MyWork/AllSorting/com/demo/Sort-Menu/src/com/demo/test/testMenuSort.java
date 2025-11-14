package com.demo.test;

import java.util.Scanner;

import com.demo.sort.sortingService;

public class testMenuSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(true)
		{
			System.out.println("\n=== Sortinig Menu ===");
            System.out.println("1.Bubble Sort");
            System.out.println("2.Quick Sort");
            System.out.println("3.Insertion Sort");
            System.out.println("4.Merge Sort");
            System.out.println("5.Selection Sort ");
            System.out.println("6.Counting Sort");
            System.out.println("7.Exit");
            System.out.print("Enter Choice : ");
            int ch=sc.nextInt();
            
            switch(ch)
            {
            
            case 1->{
            	sortingService.menububblesort();
            }
            
            case 2->{
            	sortingService.menuquicksort();
            }
            
            case 3->{
            	sortingService.menuinsertionsort();
            }
            
            case 4->{
            	sortingService.menumergesort();
            }
            
            case 5->{
            	sortingService.menuselectionsort();
            }
            
            case 6->{
            	sortingService.menucountingsort();
            }
            
            case 7->{
            	System.out.println("Thank u!!!");
            	System.exit(0);
            }
           default ->{
        	   System.out.println("Invalid Choice!!!!!!!");
        	   
           }
            
            }
		}
		
		
	}

}
