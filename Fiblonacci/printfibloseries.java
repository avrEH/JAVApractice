import java.util.Scanner;

class PrintFibonacciSeries {
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
        
        // Print the message indicating the start of the Fibonacci series
        System.out.println("The Fibonacci series is ");
        
        // Loop to print Fibonacci numbers until the count reaches 'n'
        while (count <= n) {
            // Print the current value of 'a' which is a Fibonacci number
            System.out.print(a + " ");
            
            // Store the current value of 'b' in a temporary variable 'temp'
            int temp = b;
            
            // Calculate the next Fibonacci number
            b = b + a;
            
            // Update 'a' to the old value of 'b'
            a = temp;
            
            // Increment the counter
            count++;
        }
    }
}

