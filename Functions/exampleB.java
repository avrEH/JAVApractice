import java.util.Scanner;  // Import the Scanner class for user input

class exampleB {

    public static void main(String[] args) {
        // Main function - program execution starts here
        int answer = sum2(2,3);  // Call the sum2() function and store the returned value in answer
        System.out.println(answer);  // Print the calculated sum to the console
    }

    static int sum2(int a , int b) {
        // Function to calculate the sum of two numbers entered by the user
        int sum = a + b;  // Calculate the sum of n and m and store it in sum

        return sum;  // Return the calculated sum from the function
    }
}

