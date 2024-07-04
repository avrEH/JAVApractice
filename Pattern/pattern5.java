package Pattern;
class pattern5
{
    public static void main(String[] args) {
        int n = 5;
        int x;
        for (int i = 1;i<=2*n-1;i++)
        {
            if (i>n)
            x=2*n-i;
            else
            x=i;
            for (int j=1;j<=x;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}// OUTPUT
// *
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *


