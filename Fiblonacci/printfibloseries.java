import java.util.Scanner;

class printfiblonacciSeries
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give a range for the fiblonacci series");
        int n =in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        System.out.println("The fiblonacci series is ");
        while (count <=n){
            System.out.print( a+" ");
            int temp = b ;
            b=b+a;
            a=temp;
            count ++;

        }
        


    }
}
