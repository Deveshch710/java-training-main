package com.coforge;
import java.util.Scanner;

public class MergeArrays {

    public static int[] merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        int[] result = new int[n + m];

        int i = 0, j = 0, k = 0;

        // Merge both arrays
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        while (i < n) {
            result[k++] = arr1[i++];
        }
        while (j < m) {
            result[k++] = arr2[j++];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input first sorted array
        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input second sorted array
        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];

        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        // Merge arrays
        int[] merged = merge(arr1, arr2);

        // Print merged array
        System.out.println("Merged Sorted Array:");
        for (int num : merged) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}