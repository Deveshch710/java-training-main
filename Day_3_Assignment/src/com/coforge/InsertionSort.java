package com.coforge;
import java.util.*;
public class InsertionSort {
	 static void swap(int arr[], int i, int j) {
  	   int temp = arr[i];
  	   arr[i]=arr[j];
  	   arr[j]=temp;
     }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n= sc.nextInt();
       int [] arr = new int[n];
       for(int i=0;i<n;i++) {
    	   arr[i]= sc.nextInt();
       }  
       for(int i=1;i<n;i++) {
    	   int j= i;
    	   while(j>0 && arr[j-1]>arr[j]){
    		   swap(arr,j,j-1);
    		   j--;
    	   }
       }
       sc.close();
       for(int i=0;i<n;i++) {
    	   System.out.print(arr[i]+" ");
       }
       
//      Time complexity O(n^2)
//		Space Complexity O(1)
       
    }
}