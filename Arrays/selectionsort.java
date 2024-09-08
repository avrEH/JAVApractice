import java.util.*;
public class selectionsort {

    public static void main(String[] args) {
        System.out.println("Enter the no of element you want in array");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("Enter element in array");
        int arr[]= new int[x];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i = 0;i<arr.length;i++){
            int last =arr.length-i-1;
            int maxIndex= getMaxIndex(arr,0,last);//get max is declared below
            swap(arr, maxIndex, last);//swap is declared below

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    static int getMaxIndex(int[]arr , int start,int end){
        int max= start ;
        for (int i =start;i<=end;i++ ){
            if (arr[max]<arr[i]){
                max=i;
            }
        }return max;

    }
    static void swap(int []arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}