import java.util.Scanner;

public class linearSearch { // Class name should start with a capital letter as per Java naming conventions
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object to take input from the user
        
        // Asking the user to input the number of elements they want in the array
        System.out.println("Enter the number of elements you need in the array:");
        int x = sc.nextInt(); // Storing the user input in variable x
        
        int arr[] = new int[x]; // Creating an array of size x
        
        // Prompting the user to input the elements of the array
        System.out.println("Enter elements in the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // Storing each input in the array
        }
        
        // Asking the user to input the element they want to search for in the array
        System.out.println("Enter the element you need to search:");
        int search = sc.nextInt(); // Storing the search element
        
        int counter = 0; // Initializing a counter to keep track of how many times the element is found
        
        // Looping through the array to search for the element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) { // If the current element matches the search element
                System.out.println("Element found at index " + i); // Print the index where the element is found
                counter++; // Increment the counter
            }
        }
        
        // After the loop, check if the element was found
        if (counter > 0) {
            System.out.println("Element found " + counter + " times."); // If found, print how many times
        } else {
            System.out.println("No element found."); // If not found, print a message
        }
    }
