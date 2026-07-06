package com.coforge;
import java.util.*;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1]; 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int element = sc.nextInt();
        int pos = sc.nextInt(); 

        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = element;
        n++;
        System.out.println("Array after insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}