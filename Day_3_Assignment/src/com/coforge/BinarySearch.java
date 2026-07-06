package com.coforge;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n= sc.nextInt();
       int [] arr = new int[n];
       for(int i=0;i<n;i++) {
    	   arr[i]= sc.nextInt();
       }
       Arrays.sort(arr);
       System.out.println("Enter the number that you want to search:");
       int x= sc.nextInt();
       int low=0;
       int high= n-1;
       Boolean flag = false;
       while (low<=high) {
    	   int mid = (low+high)/2;
    	   if(arr[mid]==x){
    		   flag=true;
    		   System.out.println("Found number at index: " + mid);   
    		   break;
    	   }
    	   else if(arr[mid]<x) {
    		   low=mid+1;
    	   }
    	   else {
    		   high=mid-1;
    	   }
       }
       if(!flag){
    	   System.out.println(" Not Found number");
    	   
       }  
       sc.close();
    }
}