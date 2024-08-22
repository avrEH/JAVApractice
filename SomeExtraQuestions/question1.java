import java.util.*;
class sum {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Give no of row ");
       int row =sc.nextInt();
       System.out.println("Give no of col ");
       int col =sc.nextInt();
       int[][] matrix1= new int[row][col];
       int[][] matrix2= new int[row][col];
       int[][] sum= new int[row][col];   
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
       for (int i =0;i<row;i++)
       {
        for (int j=0;j<col;j++)
        {
            sum[i][j]=matrix1[i][j]+matrix2[i][j];
        }
       }
       System.out.println(" The Sum Of The Given Matrix is");
       for (int i =0;i<row;i++)
       {
        for (int j=0;j<col;j++)
        { System.out.print(sum[i][j] + " ");
        
       
        }System.out.println();
    }}
}