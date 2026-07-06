package com.coforge;

import java.util.Scanner;

public class PrimeNumbers {

    static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Prime Numbers:");

        for (int num : arr) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}