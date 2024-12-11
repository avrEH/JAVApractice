import java.util.Scanner;

class countoccurance
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rem,count=0;
        System.out.println("Input a positive integer");
        int n = sc.nextInt();
        System.out.println("Enter the value to check its occurance");
        int check=sc.nextInt();
        while ( n>0)
        {
            rem = n%10;
            if (rem == check)
            {
                count ++;
            }
            n=n/10;
        }
        System.out.println("No of time "+check+" occured is "+count);
    }
}
