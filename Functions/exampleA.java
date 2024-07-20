
import java.util.Scanner;  // Import the Scanner class for user input

class exampleA {

    public static void main(String[] args) {
        // Main function - program execution starts here
        int answer = sum2();  // Call the sum2() function and store the returned value in answer
        System.out.println(answer);  // Print the calculated sum to the console
    }

    static int sum2() {
        // Function to calculate the sum of two numbers entered by the user

        Scanner sc = new Scanner(System.in);  // Create a Scanner object to read user input

        System.out.println("Give two numbers: "); // Prompt the user to enter two numbers
        int n = sc.nextInt();  // Read the first integer entered by the user and store it in n
        int m = sc.nextInt();  // Read the second integer entered by the user and store it in m

        int sum = n + m;  // Calculate the sum of n and m and store it in sum

        return sum;  // Return the calculated sum from the function
    }
}
