package com.coforge;
import java.util.*;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int pos = sc.nextInt(); 

        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        n--;

        System.out.println("Array after deletion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}