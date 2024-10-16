package Recursion;

public class recusrionBasic1 {

 

        public static void main(String[] args) {
            function1(0);
        }
    
        static void function1(int x) {
            // Base condition to stop recursion
            if (x > 4) {
                return;
            }
    
            // Print statement
            System.out.println("Hello World");
    
            // Recursive call with incremented x
            function1(x + 1);
        }
    }
    