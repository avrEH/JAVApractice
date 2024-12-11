package Recursion;

import java.util.Arrays;

public class Mergesort {

    public static void main(String[] args) {
        // Define the array to be sorted
        int arr[] = {5, 4, 6, 8, 9, 7, 62, 6, 5, 1};
        
        // Print the sorted array
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    // Recursive function to perform merge sort on an array
    static int[] mergeSort(int arr[]) {
        // Base case: if the array has only one element, it is already sorted
        if (arr.length == 1) {
            return arr;
        }

        // Calculate the middle index to split the array
        int mid = arr.length / 2;

        // Recursively sort the left half of the array
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));

        // Recursively sort the right half of the array
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        // Merge the two sorted halves
        return merge(left, right);
    }

    // Function to merge two sorted arrays into one sorted array
    public static int[] merge(int first[], int second[]) {
        // Create a new array to store the merged result
        int[] sorted = new int[first.length + second.length];

        // Initialize pointers for both input arrays and the result array
        int i = 0, j = 0, k = 0;

        // Merge elements from both arrays until one of them is exhausted
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                // If the current element in the first array is smaller, add it to the result
                sorted[k] = first[i];
                i++;
            } else {
                // If the current element in the second array is smaller, add it to the result
                sorted[k] = second[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from the first array
        while (i < first.length) {
            sorted[k] = first[i];
            k++;
            i++;
        }

        // Copy any remaining elements from the second array
        while (j < second.length) {
            sorted[k] = second[j];
            k++;
            j++;
        }

        // Return the merged sorted array
        return sorted;
    }
}
