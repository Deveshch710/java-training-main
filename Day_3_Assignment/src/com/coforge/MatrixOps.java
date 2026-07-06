package com.coforge;
import java.util.Scanner;

public class MatrixOps{

    static Scanner sc = new Scanner(System.in);

    // Input Matrix
    static void inputMatrix(int[][] arr, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    // Display Matrix
    static void displayMatrix(int[][] arr, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Addition
    static void add(int[][] a, int[][] b, int r, int c) {
        int[][] sum = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Addition:");
        displayMatrix(sum, r, c);
    }

    // Subtraction
    static void subtract(int[][] a, int[][] b, int r, int c) {
        int[][] sub = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sub[i][j] = a[i][j] - b[i][j];
            }
        }

        System.out.println("Subtraction:");
        displayMatrix(sub, r, c);
    }

    // Multiplication
    static void multiply(int[][] a, int[][] b, int r1, int c1, int c2) {
        int[][] mul = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Multiplication:");
        displayMatrix(mul, r1, c2);
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n----- Matrix Menu -----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            if (choice == 4) {
                System.out.println("Program Ended.");
                break;
            }

            if (choice == 1 || choice == 2) {

                System.out.print("Enter rows and columns: ");
                int r = sc.nextInt();
                int c = sc.nextInt();

                int[][] a = new int[r][c];
                int[][] b = new int[r][c];

                System.out.println("Enter First Matrix:");
                inputMatrix(a, r, c);

                System.out.println("Enter Second Matrix:");
                inputMatrix(b, r, c);

                if (choice == 1)
                    add(a, b, r, c);
                else
                    subtract(a, b, r, c);

            } else if (choice == 3) {

                System.out.print("Enter rows and columns of First Matrix: ");
                int r1 = sc.nextInt();
                int c1 = sc.nextInt();

                System.out.print("Enter rows and columns of Second Matrix: ");
                int r2 = sc.nextInt();
                int c2 = sc.nextInt();

                if (c1 != r2) {
                    System.out.println("Multiplication not possible!");
                    continue;
                }

                int[][] a = new int[r1][c1];
                int[][] b = new int[r2][c2];

                System.out.println("Enter First Matrix:");
                inputMatrix(a, r1, c1);

                System.out.println("Enter Second Matrix:");
                inputMatrix(b, r2, c2);

                multiply(a, b, r1, c1, c2);

            } else {
                System.out.println("Invalid Choice!");
            }
        }
    }
}