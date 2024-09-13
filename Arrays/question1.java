import java.util.*;
public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input length of array");
        int x = sc.nextInt(); // Length of array
        int arr[] = new int[x];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element in array");
            arr[i] = sc.nextInt(); // Input elements of array
        }
        System.out.println("Input target");
        int w = sc.nextInt(); // Target sum
        
        int a = -1, b = -1; // Indices to store the result
        
        // Finding two elements that sum up to w
        for (int i = 0; i < arr.length; i++) {
            for (int z = i + 1; z < arr.length; z++) { // Start from i+1 to avoid re-checking
                if (arr[i] + arr[z] == w) {
                    a = i;
                    b = z;
                    break; // Break as soon as we find a valid pair
                }
            }
            if (a != -1 && b != -1) break; // If pair is found, stop searching
        }
        
        
        if (a != -1 && b != -1) {
            System.out.println(a + " " + b);
        } else {
            System.out.println("No valid pair found");
        }
    }
}
