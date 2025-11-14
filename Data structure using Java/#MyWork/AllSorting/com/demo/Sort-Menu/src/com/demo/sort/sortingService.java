package com.demo.sort;

import java.util.Arrays;
import java.util.Scanner;

public class sortingService {

	
	
	//bubble sort====================================
	public static void menububblesort() {
		Scanner sc = new Scanner(System.in);
		
		
		
		int[] arr = {21, 2, 5, 1, 7, 8, 10, 3};
		System.out.println("Array : " + Arrays.toString(arr));
		System.out.println("1.Ascending\n2.Descending\nEnter choice");
		int ch=sc.nextInt();
		
		if(ch==1)
		{
			System.out.println("Bubble sort Ascending ->");
			bubblesortAscending(arr);
		}
		else {
			System.out.println("Bubble sort Descending ->");
			bubblesortDescending(arr);
		}
		
		System.out.println("Final Sort->\n " + Arrays.toString(arr));
		
	}

	private static void bubblesortAscending(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			boolean flag = false;
			
			for(int j=1;j<arr.length-i;j++)
			{
				if(arr[j-1]>arr[j]) {
				 flag = true;
				 int temp = arr[j-1];
				 arr[j-1] = arr[j];
				 arr[j]= temp;
				 
				}
			}
			 System.out.println("Iteration: " + i);
	         System.out.println(Arrays.toString(arr));
	         System.out.println();
			if(!flag)
			{
				break;
			}
		}
		
		
	}

	private static void bubblesortDescending(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			boolean flag = false;
			
			for(int j=1;j<arr.length-i;j++)
			{
				if(arr[j-1]<arr[j]) {
				 flag = true;
				 int temp = arr[j-1];
				 arr[j-1] = arr[j];
				 arr[j]= temp;
				 
				}
			}
			 System.out.println("Iteration: " + i);
	         System.out.println(Arrays.toString(arr));
	         System.out.println();
			if(!flag)
			{
				break;
			}
		}
		
		
	}

	//Quick Sort =============================================
	public static void menuquicksort() {
		
		int[] arr= {2,7,6,9,5,10,25,20,1}; 
		System.out.println("Array : " + Arrays.toString(arr));
		
		 System.out.println("\nQuick Sort Ascending");
		 //      array, start , end 
		 quicksort(arr,   0,  arr.length - 1);
		 
		 
		 
		System.out.println("Final Sorting " + Arrays.toString(arr));
	}

	private static void quicksort(int[] arr, int start, int end) {
		
		 if(start<end)
		 {
			 int p= partition(arr,start,end);
			 quicksort(arr, start, p-1);
			 quicksort(arr, p+1, end);
		 }
	}

	private static int partition(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		int pivot = start;
		int i=start;
		int j= end;
		 while(i<j){
			 while(i<end && arr[i]<=arr[pivot] ) {
				 i++;
			 }
			 while(j>start && arr[j]>arr[pivot]) {
				 j--;
			 }
			 if(i<j)
			 {
				 int temp = arr[i];
				 arr[i]= arr[j];
				 arr[j]=temp;
			 }
		 }
		 if(pivot != j)
		 {
			int temp = arr[pivot];
			arr[pivot] = arr[j];
			arr[j] = temp;
		 }
		 System.out.println(Arrays.toString(arr));
		
		return j;
	}

	//Insertion sort===========================================
	public static void menuinsertionsort() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = {21, 11, 13, 22, 25, 7, 10, 8, 1};
		System.out.println("Array : "+ Arrays.toString(arr));
		
		System.out.println("1.Ascending\n2.Descending\nEnter choice");
		int ch=sc.nextInt();
		
		if(ch==1)
		{
			System.out.println("insertion sort Ascending ->");
			insertionsortAscending(arr);
		}
		else {
			System.out.println("insertionsort Descending ->");
			insertionsortDescending(arr);
		}
		
		System.out.println("Final Sort->\n " + Arrays.toString(arr));
		
	}

	private static void insertionsortAscending(int[] arr) {
		// TODO Auto-generated method stub
		for(int i =1; i<arr.length ;i++)
		{
			int j = i-1;
			int key = arr[i];
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
				
			}
			
			arr[j+1] = key ;
			System.out.println( Arrays.toString(arr));
		}
		
	}
	private static void insertionsortDescending(int[] arr) {
		// TODO Auto-generated method stub
		for(int i =1; i<arr.length ;i++)
		{
			int j = i-1;
			int key = arr[i];
			while(j>=0 && arr[j]<key)
			{
				arr[j+1]=arr[j];
				j--;
				
			}
			
			arr[j+1] = key ;
			System.out.println( Arrays.toString(arr));
		}
		
	}

	
	//Merge sort===============================
	public static void menumergesort() {
		// TODO Auto-generated method stub
		int[] arr= {2,7,6,9,5,10,25,20,1}; 
		System.out.println("Array : " + Arrays.toString(arr));
		
		
		 System.out.println("\nMerge Sort Ascending");
		 //      array, start , end 
		 mergesort(arr,   0,  arr.length - 1);
		
	System.out.println("Final Sorting " + Arrays.toString(arr));
		
	}

	private static void mergesort(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		
	}
	
	//Selection sort=====================================
	public static void menuselectionsort() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		 int[] arr = {15, 13, 30, 20, 5, 7, 21, 2};
		 
	        System.out.println("Array: " + Arrays.toString(arr));
	        
	        System.out.print("1.Ascending\n2.Descending\nEnter choice");
	        int ch=sc.nextInt();
	        if (ch == 1) {
	            System.out.println("\nSelection Sort Ascending");
	            selectionSortAscending(arr);
	        } else {
	            System.out.println("\n Selection Sort Descending ");
	            selectionSortDescending(arr);
	        }
	        System.out.println("Final: " + Arrays.toString(arr));
		
	}

	private static void selectionSortDescending(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			int maxpos = findMax(arr, i);
			int temp = arr[i];
			arr[i] = arr[maxpos];
			arr[maxpos] = temp;
			
			System.out.println(Arrays.toString(arr));
		
	}
	}

	private static void selectionSortAscending(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length -1;i++)
		{
			int minpos = findMin(arr,i);
			int temp = arr[i];
			arr[i]=arr[minpos];
			arr[minpos]= temp;
			System.out.println(Arrays.toString(arr));
		}
	}
	private static int findMin(int[] arr, int start) {
		// TODO Auto-generated method stub
		int minpos=start;
		int min=arr[start];
		for(int i=start ;i<arr.length;i++)
		{
			
			if(min>arr[i])
			{
				
				min=arr[i];
				minpos=i;
				
				
			}
		}
		return minpos;
	

	
		
	}

	private static int findMax(int[] arr, int start) {
		int maxpos = start;
		int max = arr[start];
		for(int i = start; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				maxpos = i;
			}
			
		}
		return maxpos;
	}

	//Counting sort =================================================
	public static void menucountingsort() {
		// TODO Auto-generated method stub
		int[] arr= {6, 5, 4, 8, 6, 9, 5, 3, 4, 6, 9 };
		System.out.println("Array :" + Arrays.toString(arr));
		
	}



}
