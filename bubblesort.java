import java.util.*;
public class bubblesort {

    public static void main(String[] args) {
        System.out.println("Enter the no of element you want in array");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("Enter element in array");
        int arr[]= new int[x];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for (int j=1;j<arr.length-i;j++){
                if (arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
               
                        }

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
}