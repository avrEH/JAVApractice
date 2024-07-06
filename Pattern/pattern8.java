package Pattern;
class pattern8
{
    public static void main(String[] args) {
        int n =5;
        for( int i = 1 ; i <= n;i++)
        {
            int spa=n-i;
            for ( int space = 1; space <=spa;space ++)
            {
                System.out.print(" ");

            }
            for(int j = i ; j >= 1;j--)
            {
                System.out.print(j+" ");

            } 
            System.out.println();
        }}} 
        //     OUTPUT
        //     1 
        //    2 1 
        //   3 2 1 
        //  4 3 2 1 
        // 5 4 3 2 1
