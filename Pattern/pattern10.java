package Pattern;
class pattern10 {
    public static void main(String[] args) {
        
        int n = 5; // The number of rows for the upper half of the pattern
        int c; // Variable to hold the current row number for the pattern

        // Loop for each row from 1 to 2n (total number of rows)
        for (int i = 1; i <= 2*n; i++) {
            if (i > n)
                c = 2*n - i; // Adjust row number for the lower half of the pattern
            else
                c = i; // Row number for the upper half of the pattern

            // Print leading spaces
            for (int space = 0; space <= n - c; space++) {
                System.out.print("  ");
            }

            // Print descending numbers from c to 1
            for (int j = c; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Print ascending numbers from 2 to c
            for (int j = 2; j <= c; j++) {
                System.out.print(j + " ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}//     OUTPUT
//           1 
//         2 1 2
//       3 2 1 2 3
//     4 3 2 1 2 3 4
//   5 4 3 2 1 2 3 4 5
//     4 3 2 1 2 3 4
//       3 2 1 2 3
//         2 1 2
//           1


