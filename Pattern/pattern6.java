package Pattern;
class pattern6
{    
    public static void main ( String[] args)
    {
        int n =  5;
    for ( int i = 1 ; i <= n ; i ++ )
    {
        int spa=n-i;
        for (int space = 1 ;space<=spa;space++)
        {
            System.out.print(" ");
        }
        for ( int j =  1; j <=i ;j++)
        {
            System.out.print("*");

        }
        System.out.println();
    }

        }
    
}OUTPUT
    *
   **
  ***
 ****
*****