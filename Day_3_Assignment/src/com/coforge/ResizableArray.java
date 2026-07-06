package com.coforge;
import java.util.Scanner;

public class ResizableArray {

    static int[] arr = new int[2];
    static int size = 0;

    // Add element
    static void add(int value) {
        if (size == arr.length) {
            resize();
        }
        arr[size] = value;
        size++;
    }

    // Resize array
    static void resize() {
        int[] newArr = new int[arr.length * 2];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        arr = newArr;
        System.out.println("Array resized to " + arr.length);
    }

    // Display array
    static void display() {
        System.out.print("Elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements do you want to add? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            int value = sc.nextInt();
            add(value);
        }

        display();

        sc.close();
    }
}