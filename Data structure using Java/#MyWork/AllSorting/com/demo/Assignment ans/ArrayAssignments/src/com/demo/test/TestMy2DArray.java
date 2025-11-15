package com.demo.test;

import java.util.Scanner;
import com.demo.array.My2DArray;

public class TestMy2DArray {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter rows for Matrix A: ");
        int r1 = sc.nextInt();
        System.out.print("Enter cols for Matrix A: ");
        int c1 = sc.nextInt();

        My2DArray mat1 = new My2DArray(r1, c1);
        My2DArray mat2 = null;

        while (true) {
            printMenu();
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("=== Enter Matrix A ===");
                    mat1.acceptData();
                    mat1.displayData();
                }
                case 2 -> {
                    System.out.println("=== Enter Matrix B (same size) ===");
                    mat2 = new My2DArray(r1, c1);
                    mat2.acceptData();
                    mat2.displayData();
                }
                case 3 -> mat1.displayData();
                case 4 -> {
                    if (mat2 != null) mat2.displayData();
                    else System.out.println("Matrix B not entered yet!");
                }
                case 5 -> {
                    mat1.reverseRows();
                    mat1.displayData();
                }
                case 6 -> mat1.maxOddInRows();
                case 7 -> mat1.rowColAverages();
                case 8 -> {
                    int[] sums = mat1.findSumRowWise();
                    System.out.println("Row-wise Sum:");
                    for (int i = 0; i < sums.length; i++) {
                        System.out.println("Row " + (i + 1) + ": " + sums[i]);
                    }
                }
                case 9 -> {
                    int[] sums = mat1.findSumColumnWise();
                    System.out.println("Column-wise Sum:");
                    for (int i = 0; i < sums.length; i++) {
                        System.out.println("Col " + (i + 1) + ": " + sums[i]);
                    }
                }

                // ROTATE ROWS UPWARD (flag = true)
                case 10 -> {
                    System.out.print("Rotate rows UPWARD by how many positions? ");
                    int n = sc.nextInt();
                    mat1.rowRotation(true, n);   // flag=true → upward
                    mat1.displayData();
                }

                // ROTATE ROWS DOWNWARD (flag = false)
                case 11 -> {
                    System.out.print("Rotate rows DOWNWARD by how many positions? ");
                    int n = sc.nextInt();
                    mat1.rowRotation(false, n);  // flag=false → downward
                    mat1.displayData();
                }

                // ROTATE COLUMNS RIGHT (flag = true)
                case 12 -> {
                    System.out.print("Rotate columns RIGHT by how many positions? ");
                    int n = sc.nextInt();
                    mat1.columnRotation(true, n);   // flag=true → right
                    mat1.displayData();
                }

                // ROTATE COLUMNS LEFT (flag = false)
                case 13 -> {
                    System.out.print("Rotate columns LEFT by how many positions? ");
                    int n = sc.nextInt();
                    mat1.columnRotation(false, n);  // flag=false → left
                    mat1.displayData();
                }

                case 14 -> {
                    int[][] t = mat1.transpose();
                    System.out.println("Transpose:");
                    displayArray(t);
                }
                case 15 -> {
                    System.out.println(mat1.isSymmetric() ? "Symmetric Matrix" : "Not Symmetric");
                }
                case 16 -> {
                    System.out.println(mat1.isIdentity() ? "Identity Matrix" : "Not Identity");
                }
                case 17 -> {
                    if (mat2 == null) {
                        System.out.println("Enter Matrix B first!");
                    } else {
                        int[][] res = mat1.add2DArrays(mat2);
                        if (res != null) {
                            System.out.println("Addition Result:");
                            displayArray(res);
                        } else {
                            System.out.println("Dimensions do not match!");
                        }
                    }
                }
                case 18 -> {
                    if (mat2 == null) {
                        System.out.println("Enter Matrix B first!");
                    } else {
                        int[][] res = mat1.subtract2DArrays(mat2);
                        if (res != null) {
                            System.out.println("Subtraction Result:");
                            displayArray(res);
                        } else {
                            System.out.println("Dimensions do not match!");
                        }
                    }
                }
                case 19 -> {
                    System.out.println("Byeeeeeee!");
                    sc.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("           2D ARRAY OPERATIONS MENU");
        System.out.println("=".repeat(50));
        System.out.println("1.  Enter Matrix A");
        System.out.println("2.  Enter Matrix B (same size)");
        System.out.println("3.  Display Matrix A");
        System.out.println("4.  Display Matrix B");
        System.out.println("5.  Reverse Every Row");
        System.out.println("6.  Max Odd in Each Row");
        System.out.println("7.  Row & Col Averages + Sum");
        System.out.println("8.  Row-wise Sum");
        System.out.println("9.  Column-wise Sum");
        System.out.println("10. Rotate Rows UPWARD     (flag=true)");
        System.out.println("11. Rotate Rows DOWNWARD   (flag=false)");
        System.out.println("12. Rotate Columns RIGHT   (flag=true)");
        System.out.println("13. Rotate Columns LEFT    (flag=false)");
        System.out.println("14. Transpose Matrix");
        System.out.println("15. Check Symmetric");
        System.out.println("16. Check Identity");
        System.out.println("17. Add Matrices");
        System.out.println("18. Subtract Matrices");
        System.out.println("19. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void displayArray(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------");
    }
}