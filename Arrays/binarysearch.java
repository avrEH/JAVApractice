import java.util.*;

public class binarysearch {

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
        
        // Sorting the array before performing binary search
        Arrays.sort(arr);

        // Asking the user to input the element they want to search for in the array
        System.out.println("Enter the element you need to search:");
        int search = sc.nextInt(); // Storing the search element
        int ans = binary(arr, search);

        if (ans != -1) {
            System.out.println("The element is at index " + ans);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    static int binary(int[] arr, int search) {
        int start = 0;
        int last = arr.length - 1;
        while (start <= last) {
            int mid = start + (last - start) / 2;
            if (search < arr[mid]) {
                last = mid - 1;
            } else if (search > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
