package Pattern;
class pattern2 {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        // Loop to print each row
        for (int i = 1; i <= n; i++) {
            // Print stars in increasing order from 1 to the current row number
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}

//OUTPUT
// * 
// * * 
// * * * 
// * * * * 
// * * * * * 