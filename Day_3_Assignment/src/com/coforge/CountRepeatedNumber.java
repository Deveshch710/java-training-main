package com.coforge;
import java.util.*;
public class CountRepeatedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Number to search
        int target = sc.nextInt();

        int count = 0;

        // Count occurrences
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        System.out.println(target + " is repeated " + count + " times.");

        sc.close();
    }
}