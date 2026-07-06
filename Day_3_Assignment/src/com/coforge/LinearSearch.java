package com.coforge;
import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n= sc.nextInt();
       int [] arr = new int[n];
       for(int i=0;i<n;i++) {
    	   arr[i]= sc.nextInt();
       }
       System.out.println("Enter the number that you want to search:");
       int x= sc.nextInt();
       Boolean flag= false;
       for(int i=0;i<n;i++) {
    	   if(arr[i]==x) {
    		   System.out.println("Yes this number is present in array at index"+ i);
    		   flag=true;
    		   break;
    	   }
       }
       if(!flag) {
    	   System.out.println("oops ! this number is  not present in array");
       }
       sc.close();
    }
}