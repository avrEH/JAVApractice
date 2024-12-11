package Recursion;

import java.util.Arrays;

public class quicksort {

    public static void main(String[] args) {
         int arr[] = {5, 4, 6, 8, 9, 7, 62, 6, 5, 1};
         sort(arr,0,arr.length-1);
        // Print the sorted array
        System.out.println(Arrays.toString(arr));
        
    }
    static void sort(int [] arr,int low ,int hi){
        if (low>=hi){
            return;
        }
        int s= low ;
        int e= hi;
        int m= s+(e-s)/2;
        int pivot=arr[m];

        while (s<=e){
            while (arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if (s<=e){
                int tem = arr[s];
                arr[s]=arr[e];
                arr[e]=tem;
                s++;
                e--;
            }
        }
        //now the pivot is at correct index , now we have to sort the two halves created
        sort(arr,low,e);
        sort(arr,s,hi);

    }
}