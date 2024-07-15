import java.util.Scanner;

class fiblonacciSeries
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give a range for the fiblonacci series");
        int n =in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (count <=n){
            int temp = b ;
            b=b+a;
            a=temp;
            count ++;

        }
        System.out.println("The Sum of the series is \t"+b);


    }
}
