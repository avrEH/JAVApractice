
//only can be usend when given arrayy is in the form of 1 to N

import java.util.Scanner;

public class cyclesort {
 public static void main(String[] args) {
    
        System.out.println("Enter the no of element you want in array");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("Enter element in array");
        int arr[]= new int[x];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int i =0;
        while(i<arr.length){//5 4 3 2 1
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct])// if 5 is not eqaual to 1(which is at index 4 where 5 should be) 
            {
                swap(arr, i, correct);
            }
            else{
                i++;
            }

        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }

    
 }
 static void swap(int []arr,int first,int second){
    int temp=arr[first];
    arr[first]=arr[second];
    arr[second]=temp;
}
    
}