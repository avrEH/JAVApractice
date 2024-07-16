import java.util.Scanner;

class sumOfFibonacciSeries {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);
        
        // Prompt the user to enter the range for the Fibonacci series
        System.out.println("Give a range for the Fibonacci series");
        
        // Read the user input and store it in the variable 'n'
        int n = in.nextInt();
        
        // Initialize the first two Fibonacci numbers
        int a = 0; // First Fibonacci number
        int b = 1; // Second Fibonacci number
        
        // Initialize the counter starting from 2 since we already have the first two numbers
        int count = 2;
        
        // Calculate Fibonacci numbers until the count reaches 'n'
        while (count <= n) {
            // Store the current value of 'b' in a temporary variable 'temp'
            int temp = b;
            
            // Calculate the next Fibonacci number
            b = b + a;
            
            // Update 'a' to the old value of 'b'
            a = temp;
            
            // Increment the counter
            count++;
        }
        
        // Print the sum of the series which is the 'n'th Fibonacci number
        System.out.println("The Sum of the series is \t" + b);
    }
}
