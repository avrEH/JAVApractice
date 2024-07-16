import java.util.Scanner; // Importing the Scanner class for taking input from the user

class CountOccurrence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Creating a Scanner object for user input
        int rem, count = 0; // Initializing remainder and count variables
        System.out.println("Input a positive integer");
        int n = sc.nextInt(); // Taking a positive integer input from the user
        System.out.println("Enter the value to check its occurrence");
        int check = sc.nextInt(); // Taking the digit whose occurrence needs to be checked

        // Loop to count the occurrences of the digit in the number
        while (n > 0) {
            rem = n % 10; // Getting the last digit of the number
            if (rem == check) {
                count++; // Incrementing the count if the digit matches
            }
            n = n / 10; // Removing the last digit from the number
        }
        // Printing the result
        System.out.println("Number of times " + check + " occurred is " + count);
    }
}
