import java.util.Scanner; // Import the Scanner class for user input

class example2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input
        System.out.println("Choose a number between 1 to 7"); // Prompt the user for input
        int n = sc.nextInt(); // Read the input as an integer
        switch (n) { // Start the switch statement to handle different cases
            case 1:
                System.out.println("Monday"); // Print "Monday" if the input is 1
                break; // Exit the switch statement
            case 2:
                System.out.println("Tuesday"); // Print "Tuesday" if the input is 2
                break;
            case 3:
                System.out.println("Wednesday"); // Print "Wednesday" if the input is 3
                break;
            case 4:
                System.out.println("Thursday"); // Print "Thursday" if the input is 4
                break;
            case 5:
                System.out.println("Friday"); // Print "Friday" if the input is 5
                break;
            case 6:
                System.out.println("Saturday"); // Print "Saturday" if the input is 6
                break;
            case 7:
                System.out.println("Sunday"); // Print "Sunday" if the input is 7
                break;
            default:
                main(args); // If the input is not between 1 and 7, call main() again to restart the process
        }
    }
}
