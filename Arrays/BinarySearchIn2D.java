import java.util.*;
public class BinarySearchIn2D {
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
            System.out.println("Element found at: " + Arrays.toString(ans));
        } else {
            System.out.println("Element not found.");
        }
    }
    static int[] Search (int arr[][],int target){
        int r=0;
        int c= arr.length-1;// we intialize the column value to search from the top-right corner of the matrix 
        while(r<arr.length && c>=0 ){
            if (arr[r][c]==target){
                return new int[]{r,c};
            }
            if (arr[r][c]<target){
                r++;
            }
            else{
                c--;
            }
            }
            return null;
        }

    }
        
    

    
