import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of element you need in the array");
    int x=sc.nextInt();
    int arr[]= new int[x];
    System.out.println("Enter element in array");
    for (int i =0;i<arr.length;i++){
        arr[i]=sc.nextInt();

    }
    System.out.println("Enter element you need to search");
    int search=sc.nextInt();
    int counter=0;
    for (int i =0;i<arr.length;i++){
        if (arr[i]==search){
            System.out.println("Element found  At Index "+i);
            counter++;

        }}
        if (counter>0){
            System.out.println();
        }
        else {
            System.out.println("No element found");
        }

 }
    
}