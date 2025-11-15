package com.demo.array;

import java.util.Scanner;

public class My2DArray {
    private int[][] arr;

    public My2DArray() {
        arr = new int[3][3];
    }

    public My2DArray(int rows, int cols) {
        arr = new int[rows][cols];
    }

    public void acceptData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements for " + arr.length + "x" + arr[0].length + " matrix:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter arr[" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public void displayData() {
        System.out.println("\nMatrix:");
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------");
    }

    // 1. Reverse every row
    public void reverseRows() {
        for (int i = 0; i < arr.length; i++) {
            int left = 0, right = arr[i].length - 1;
            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
        System.out.println("All rows reversed.");
    }

    // 2. Max odd in each row
    public void maxOddInRows() {
        System.out.println("Maximum odd number in each row:");
        for (int i = 0; i < arr.length; i++) {
            int maxOdd = Integer.MIN_VALUE;
            boolean found = false;
            for (int val : arr[i]) {
                if (val % 2 == 1 && val > maxOdd) {
                    maxOdd = val;
                    found = true;
                }
            }
            if (found) {
                System.out.println("Row " + (i + 1) + ": " + maxOdd);
            } else {
                System.out.println("Row " + (i + 1) + ": No odd number");
            }
        }
    }

    // 3. Row & Column Averages + Sum of Averages
    public void rowColAverages() {
        double[] rowAvg = new double[arr.length];
        double[] colAvg = new double[arr[0].length];

        // Row averages
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            rowAvg[i] = (double) sum / arr[i].length;
        }

        // Column averages
        for (int j = 0; j < arr[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][j];
            }
            colAvg[j] = (double) sum / arr.length;
        }

        double sumRowAvg = 0, sumColAvg = 0;
        for (double r : rowAvg) sumRowAvg += r;
        for (double c : colAvg) sumColAvg += c;

        System.out.println("Row Averages: ");
        for (int i = 0; i < rowAvg.length; i++) {
            System.out.printf("Row %d: %.2f%n", i + 1, rowAvg[i]);
        }

        System.out.println("\nColumn Averages: ");
        for (int j = 0; j < colAvg.length; j++) {
            System.out.printf("Col %d: %.2f%n", j + 1, colAvg[j]);
        }

        System.out.printf("%nSum of all Row Averages: %.2f%n", sumRowAvg);
        System.out.printf("Sum of all Column Averages: %.2f%n", sumColAvg);
    }

    public int[] findSumRowWise() {
        int[] sumrows = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sumrows[i] += arr[i][j];
            }
        }
        return sumrows;
    }

    public int[] findSumColumnWise() {
        int[] sumcols = new int[arr[0].length];
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                sumcols[j] += arr[i][j];
            }
        }
        return sumcols;
    }

    public int[][] add2DArrays(My2DArray ob) {
        if (this.arr.length != ob.arr.length || this.arr[0].length != ob.arr[0].length) {
            return null;
        }
        int[][] temp = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                temp[i][j] = this.arr[i][j] + ob.arr[i][j];
            }
        }
        return temp;
    }

    public int[][] subtract2DArrays(My2DArray ob) {
        if (this.arr.length != ob.arr.length || this.arr[0].length != ob.arr[0].length) {
            return null;
        }
        int[][] temp = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                temp[i][j] = this.arr[i][j] - ob.arr[i][j];
            }
        }
        return temp;
    }

    public void rowRotation(boolean up, int num) {
        num = num % arr.length;
        if (up) {
            for (int cnt = 0; cnt < num; cnt++) {
                int[] temp = arr[0];
                for (int i = 0; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[arr.length - 1] = temp;
            }
        } else {
            for (int cnt = 0; cnt < num; cnt++) {
                int[] temp = arr[arr.length - 1];
                for (int i = arr.length - 1; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[0] = temp;
            }
        }
    }

    public void columnRotation(boolean right, int num) {
        num = num % arr[0].length;
        if (right) {
            for (int cnt = 0; cnt < num; cnt++) {
                int[] temp = new int[arr.length];
                for (int i = 0; i < arr.length; i++) {
                    temp[i] = arr[i][arr[0].length - 1];
                }
                for (int i = 0; i < arr.length; i++) {
                    for (int j = arr[0].length - 2; j >= 0; j--) {
                        arr[i][j + 1] = arr[i][j];
                    }
                }
                for (int i = 0; i < arr.length; i++) {
                    arr[i][0] = temp[i];
                }
            }
        } else {
            for (int cnt = 0; cnt < num; cnt++) {
                int[] temp = new int[arr.length];
                for (int i = 0; i < arr.length; i++) {
                    temp[i] = arr[i][0];
                }
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 1; j < arr[0].length; j++) {
                        arr[i][j - 1] = arr[i][j];
                    }
                }
                for (int i = 0; i < arr.length; i++) {
                    arr[i][arr[0].length - 1] = temp[i];
                }
            }
        }
    }

    public int[][] transpose() {
        int[][] temp = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                temp[j][i] = arr[i][j];
            }
        }
        return temp;
    }

    public boolean isSymmetric() {
        if (arr.length != arr[0].length) return false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != arr[j][i]) return false;
            }
        }
        return true;
    }

    public boolean isIdentity() {
        if (arr.length != arr[0].length) return false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j && arr[i][j] != 1) return false;
                if (i != j && arr[i][j] != 0) return false;
            }
        }
        return true;
    }
}