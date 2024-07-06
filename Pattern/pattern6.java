package Pattern;
class pattern6 {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        // Loop to print each row
        for (int i = 1; i <= n; i++) {
            // Determine the number of spaces before the stars
            int spa = n - i;

            // Print spaces
            for (int space = 1; space <= spa; space++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
// OUTPUT
        //     *
        //    **
        //   ***
        //  ****
        // *****
    
