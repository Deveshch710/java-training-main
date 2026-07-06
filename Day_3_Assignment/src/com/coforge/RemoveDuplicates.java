package com.coforge;
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (n == 0) {
            System.out.println("Array is empty");
            return;
        }

        int j = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}