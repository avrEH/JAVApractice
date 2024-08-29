package Arrays;
import java.util.Scanner;

/**
 * This program finds the maximum value in an array of integers provided by the user.
 */
public class maxvalueinarray {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user for the number of elements in the array
        System.out.println("Number of elements required:");
        int x = sc.nextInt();  // Read the number of elements

        // Create an array to hold the elements
        int arr[] = new int[x];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter elements in the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();  // Read each element into the array
        }

        // Call the max function to find the maximum value and print it
        System.out.println("Max value in the given array is " + max(arr));

    }

    
    static int max(int arr[]) {
        // Initialize maxval to the first element of the array
        int maxval = arr[0];

        // Loop through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // If the current element is greater than maxval, update maxval
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }

        // Return the maximum value found
        return maxval;
    }
}
