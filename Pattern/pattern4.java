package Pattern;
class pattern4 {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        // Loop to print each row
        for (int i = 1; i <= n; i++) {
            // Print numbers in increasing order from 1 to the current row number
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
// OUTPUT
// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5
