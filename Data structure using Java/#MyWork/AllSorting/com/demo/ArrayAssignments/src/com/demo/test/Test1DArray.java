package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

import com.demo.array.My1DArray;

public class Test1DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		My1DArray ob = new My1DArray();
		ob.add(2);
		ob.add(5);
		ob.add(7);
		ob.add(9);
		ob.add(45);
		
		
		int ch;
		 while(true) {
	            System.out.println("\n=======MyArray Menu==============================");
	            System.out.println("1.Add element at end");
	            System.out.println("2.Display array\n");
	            
	            System.out.println("3.Add element at position");
	            System.out.println("4.Delete by position");
	            System.out.println("5.Delete by value");
	            System.out.println("6.Search by value\n");
	            
	            System.out.println("7.Rotate array (left/right)");
	            System.out.println("8.Reverse array (in-place/copy)\n");
	            
	            System.out.println("9.Find maximum");
	            System.out.println("10.Find sum of elements");
	            System.out.println("11.Digit sum of each element\n\n");
	           
	            
	            System.out.println("12.Exit\n\n");
	            
	            
	            System.out.println("13. Find factorial of only prime  numbers in the array \n");
	            
	            System.out.println("14.Find maximum prime number in the array\n");
	            
	            System.out.println("15.Create a copy of array, but while copying data into "
	            		+ "another array, if the number is \r\n"
	            		+ "prime and >5 then copy the reverse of the number, otherwise"
	            		+ " copy number as it is\n");
	            System.out.print("\nEnter  choice: ");
	            ch = sc.nextInt();

	            switch (ch) {
	            
	            
	            case 1->{
	            	System.out.println("Enter Value to add in Array");
	            	int x =sc.nextInt();
	            	boolean sts =ob.add(x);
	            	if(sts) {
	            		System.out.println("Value Added in Array!");
	            	}
	            	else {
						System.out.println("Not added valueb Array is full !!!");
					}
	            }
	            
	            case 2->{
	            	System.out.println(ob);
	            	System.out.println("Size "+ob.getSize()+" Capacity: "+ob.getCapacity());
	            }
	            
	            case 3->{
	            	System.out.println("Enter Value ");
	            	int val=sc.nextInt();
	            	System.out.println("Enter position   ");
	            	int pos = sc.nextInt();
	            	boolean sts=ob.addpos(val, pos);
	            	if(sts) {
	            		System.out.println("Added ");
	            	}
	            	else {
						System.out.println("Not added value Array is full !!!");
					}
	            	
	            }
	            
	            case 4->{
	            	System.out.println("Enter position to delete:");
	            	int pos = sc.nextInt();
	            	boolean sts=ob.deleteByPos(pos);
	            	
	            	if(sts) {
	            		System.out.println("Deleted !!!!!");
	            	}
	            	else {
						System.out.println("Not Deleted !!!!!!!!");
					}
	            	
	            }
	            
	            case 5->{
	            	
	            	System.out.println("Enter Value to delete");
	            	int val=sc.nextInt();
	            	boolean sts=ob.deleteByValue(val);
	            	
	            	if(sts) {
	            		System.out.println("Deleted !!!!!");
	            	}
	            	else {
						System.out.println("Not Deleted !!!!!!!!");
					}
	            	
	            }
	            
	            case 6->{
	            	System.out.println("Enter Value ");
	            	int val=sc.nextInt();
	            	
	            	int x = ob.searchByValue(val);
	            	
	            	if(x!=-1) {
	            		System.out.println(val+"Found AT pos "+x);
	            	}
	            	else {
						System.out.println("Not Found !!!!!");
					}
	            }
	            
	            case 7->{
	            	System.out.println("Enter true rotate right\n"
	            			+ "Enter false  rotate left");
	            	boolean flag = sc.nextBoolean();
	            	System.out.println("Enter How Many time rotatation ");
	            	int num = sc.nextInt();
	            	System.out.println("Original Arrays :" + ob);
	            	ob.rotateArray(flag, num);
	            	
	            	System.out.println("After Rotation "+num+"times :"+ob);
	            	
	            	
	            }
	            
	            case 8->{
	            	
	            	System.out.print("Enter true for in-place\n Enter false for copy in 2nd array: ");
                    boolean Flag = sc.nextBoolean();
                    int[] rev = ob.reverseArray(Flag);
                    System.out.println("Original: " + ob);
                    if (Flag) {
                        System.out.println("Reversed in-place: " +Arrays.toString(rev));
                    } else {
                        System.out.println("Reversed copy: "+Arrays.toString(rev));
                        
                    }
	            }
	            
	          
	            case 9->{
	            	
	            	int max=ob.findMax(ob);
	            	System.out.println("Max No : "+max);
	            }
	            
	            case 10->{
	            	double sum=ob.getSumElements();
	            	System.out.println("Sum of elements "+ sum);
	            }
	            
	            case 11->{
	            	
	            	My1DArray sum=ob.digitSumOfAllElements();
	            	System.out.println("Digit sum of each element \n"+sum);
	            }
	            
	            case 12->{
	            	System.out.println("Thnak uu");
	            	System.exit(0);
	            }
	            
	            case 13->{
	            	
	            	My1DArray fact = ob.factOfPrime();
	     
	            	System.out.println("Factoraial of each array Elements\n"+fact);
	            }
	            
	            case 14->{
	            	int max = ob.findMaxPrime();
	            	System.out.println("Maximum Number of Prime in Array :\n"+max);
	            }
	            
	            case 15->{
	            	My1DArray primerev = ob.copyOfRevPrime();
	            	System.out.println("Copy of rev prime >5 : \n"+primerev);
	            	
	            }
	            
	             default ->{
	            	 System.out.println("Invalid Choice !!!!!!!!!!");
	             }
	            }
	            
	            
	            }
		

	}

}
