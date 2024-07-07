package Pattern;
class pattern3 {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        // Loop to print each row
        for (int i = 1; i <= n; i++) {
            // Print stars in decreasing order from n to the current row number
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}

//OUTPUT
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 
