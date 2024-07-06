package Pattern;
class pattern7 {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the upper half of the pattern
        int c; // Number of stars in the current row

        // Loop to print each row
        for (int i = 1; i <= n * 2 - 1; i++) {
            // Determine the number of stars in the current row
            if (i > n)
                c = n * 2 - i;
            else
                c = i;

            // Determine the number of spaces before the stars
            int spa = n - c;

            // Print spaces
            for (int space = 1; space <= spa; space++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= c; j++) {
                System.out.print("* ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
// OUTPUT
//     * 
//    * *
//   * * *
//  * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *

