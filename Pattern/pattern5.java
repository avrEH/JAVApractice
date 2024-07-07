package Pattern;
class pattern5 {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the upper half of the pattern
        int x; // Number of stars in the current row

        // Loop to print each row
        for (int i = 1; i <= 2 * n - 1; i++) {
            // Determine the number of stars in the current row
            if (i > n)
                x = 2 * n - i; // For rows beyond the middle, reduce the number of stars
            else
                x = i; // For rows up to the middle, increase the number of stars

            // Print stars
            for (int j = 1; j <= x; j++) {
                System.out.print("* ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
// OUTPUT
// *
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *


