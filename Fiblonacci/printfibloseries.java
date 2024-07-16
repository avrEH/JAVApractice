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
        System.out.println("The fiblonacci series is ");
        while (count <=n){
            System.out.print( a+" ");
            int temp = b ;
            b=b+a;
            a=temp;
            count ++;

        }
        


    }
}
