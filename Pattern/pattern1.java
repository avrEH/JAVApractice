package Pattern;
class pattern1 {
    public static void main(String[] args) {
        int n = 5; // Number of rows and columns

        // Loop to print each row
        for (int i = 1; i <= n; i++) {
            // Loop to print stars in each column
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}

//OUTPUT
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * *


