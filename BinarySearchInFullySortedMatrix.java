import java.util.Arrays;
import java.util.Scanner;
//incomplete


public class BinarySearchInFullySortedMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give number of rows: ");
        int row = sc.nextInt();
        System.out.println("Give number of columns: ");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];
        System.out.println("Input values in the matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the element you want to search: ");
        int search = sc.nextInt();
        int[] ans = Search(matrix, search);

        if (ans != null) {
            System.out.println("Element found at index : " + Arrays.toString(ans));
        } else {
            System.out.println("Element not found.");
        }
        
    }
    static int [] Search(int arr[],int target){
        

}}