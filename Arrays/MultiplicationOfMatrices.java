package Arrays;
import java.util.*;
class MultiplicationOfMatrices {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Give no of row ");
       int row =sc.nextInt();
       System.out.println("Give no of col ");
       int col =sc.nextInt();
       int[][] matrix1= new int[row][col];
       int[][] matrix2= new int[row][col];
       System.out.println("Input Values in matrix 1 ");     
       for (int i =0;i<row;i++)
       {
        for (int j=0;j<col;j++)
        {
            matrix1[i][j]=sc.nextInt();
        }
       }
       System.out.println("Input Values in matrix 2 ");   
       for (int i =0;i<row;i++)
       {
        for (int j=0;j<col;j++)
        {
            matrix2[i][j]=sc.nextInt();
        }
       }
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;
        
        if (cols1 != rows2) {
            System.out.println("Matrices cannot be multiplied");
            return;
        }
        
        
        int[][] result = new int[rows1][cols2];
        
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println(" The Sum Of The Given Matrix is");
       for (int i =0;i<row;i++)
       {
        for (int j=0;j<col;j++)
        { System.out.print(result[i][j] + " ");
        
       
        }System.out.println();
    }

    }
    
}
