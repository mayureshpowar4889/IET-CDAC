package com.demo.test;
import java.util.Scanner;

public class GroupByString {
    static String[] arr = new String[20];
    static int n = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter strings type 'exit' to stop:");

        while(n<20)
        {
            System.out.print(">> ");
            String s =sc.nextLine().trim();

            if(s.equals("exit"))
            	break;

            add(s);
            show();
        }
    }

    // 2nd char
    static char sec(String s) {
        if(s.length() >= 2)
        {
            return s.charAt(1);
        } else {
            return ' ';
        }
    }

    // Add string -> same 2nd char together
    static void add(String s) {
        char key= sec(s);
        int pos = n;

        for(int i = 0; i < n; i++) 
        {
            if(sec(arr[i]) == key) {
                while(i < n && sec(arr[i]) == key)
                {
                	i++;
                }
                pos = i;
                break;
            }
            if (sec(arr[i]) > key) {
                pos = i;
                break;
            }
        }

        // Shift right
        for(int i = n; i > pos; i--) {
            arr[i] = arr[i-1];
        }

        arr[pos]=s;
        n++;
    }

    // Show array
    static void show() {
        System.out.print("Array: [");
        for (int i=0;i<n; i++) 
        {
            System.out.print(arr[i]);
            if(i <n-1) 
            System.out.print(", ");
        }
        System.out.println("]\n");
    }
}