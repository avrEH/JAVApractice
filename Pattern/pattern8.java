package Pattern;
class pattern8 {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        for (int i = 1; i <= n; i++) {
            // Print spaces before the numbers
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            // Print decreasing part of the pattern
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
 
        //     OUTPUT
        //     1 
        //    2 1 
        //   3 2 1 
        //  4 3 2 1 
        // 5 4 3 2 1
