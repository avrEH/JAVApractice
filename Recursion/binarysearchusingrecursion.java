package Recursion;
import java.util.*;
/**
 * binarysearchusingrecursion
 */
public class binarysearchusingrecursion {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements you need in the array:");
        int x = sc.nextInt(); // Storing the user input in variable x
        
        int arr[] = new int[x]; // Creating an array of size x
        
        // Prompting the user to input the elements of the array
        System.out.println("Enter elements in the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // Storing each input in the array
        }
        
        // Sorting the array before performing binary search
        Arrays.sort(arr);

        // Asking the user to input the element they want to search for in the array
        System.out.println("Enter the element you need to search:");
        int target = sc.nextInt(); 
        int ans = search(arr, target,0,arr.length-1);
        System.out.println(ans);
        
    }
    static int search(int arr[],int target,int s , int e){
        if (s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(arr[m]==target){
            return m;

        }
        if (target<arr[m]){
            return search(arr, target, s, m-1);
        }
        return search(arr, target, m+1, e);
    }
}