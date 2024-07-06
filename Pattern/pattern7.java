package Pattern;
class pattern7
{
    public static void main(String[] args) {
        int n =5;
        int c;
        for( int i = 1 ; i <= n*2-1;i++)
        {
            if(i>n)
            c= n*2-i;
            else
            c=i;
            int spa=n-c;
            for ( int space = 1; space <=spa;space ++)
            {
                System.out.print(" ");

            }
            for(int j = 1 ; j <= c;j++)
            {
                System.out.print("* ");

            } 
            System.out.println();
        }
    }}// OUTPUT
//     * 
//    * *
//   * * *
//  * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *

