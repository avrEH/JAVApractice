package Pattern;
class pattern10
{
    public static void main(String[] args) {
        
        int n = 5;
        int c;
        for (int i = 1;i<=2*n;i++)
        {
            if (i>n)
            c=2*n-i;
            else
            c=i;

            for (int space = 0; space <= n- c; space++) {
                System.out.print("  ");
            }

            // Print decreasing part of the pattern
            for (int j = c; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Print increasing part of the pattern
            for (int j = 2; j <= c; j++) {
                System.out.print(j + " ");
            }

            // Move to the next line after each row
            System.out.println();  
        }}
    }

