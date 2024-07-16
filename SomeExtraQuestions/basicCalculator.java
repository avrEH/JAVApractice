import java.util.Scanner;

class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        while (true) { // Infinite loop to keep the calculator running
            System.out.println("Enter type of operation you want (choose from +, -, *, /):");
            char op = sc.next().trim().charAt(0); // Read the operation character from the user
            
            // Check if the operation is one of the valid ones
            if (op == '+' || op == '-' || op == '*' || op == '/') {
                System.out.println("Enter two numbers you want to use:");
                int n = sc.nextInt(); // Read the first number
                int m = sc.nextInt(); // Read the second number
                
                // Perform the chosen operation
                if (op == '+') {
                    System.out.println(n + m); // Addition
                } else if (op == '-') {
                    System.out.println(n - m); // Subtraction
                } else if (op == '*') {
                    System.out.println(n * m); // Multiplication
                } else if (op == '/') {
                    if (m != 0) {
                        System.out.println(n / m); // Division
                    } else {
                        System.out.println("Division by zero is not allowed."); // Error message for division by zero
                    }
                }
            } else {
                System.out.println("Invalid operation. Please enter a correct operation."); // Error message for invalid operation
            }
        }
    }
}
