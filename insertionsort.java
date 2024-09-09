import java.util.Scanner;

/**
 * insertionsort
 */
public class insertionsort {

    public static void main(String[] args) {
        System.out.println("Enter the no of element you want in array");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("Enter element in array");
        int arr[]= new int[x];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0;i<arr.length-1;i++){
            for (int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;

                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    static void swap(int []arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}