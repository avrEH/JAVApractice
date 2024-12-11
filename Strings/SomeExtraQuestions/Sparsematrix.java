import java.util.*;

class SparseMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give no of rows: ");
        int row = sc.nextInt();
        System.out.println("Give no of columns: ");
        int col = sc.nextInt();

        int[][] matrix1 = new int[row][col];
        System.out.println("Input Values in matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        for (int i =0;i<row;i++)
       {
        for (int j=0;j<col;j++)
        { System.out.print(matrix1[i][j] + " ");
        
       
        }System.out.println();
    }

        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix1[i][j] != 0) {
                    count++;
                }
            }
        }

        if (count < (row * col / 2)) { // Count less than half of total no of elements
            System.out.println("Input matrix is sparse");
            int[][] sparse = new int[3][count];

            int z = 0;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (matrix1[i][j] != 0) {
                        sparse[0][z] = i;
                        sparse[1][z] = j;
                        sparse[2][z] = matrix1[i][j];
                        z++;
                    }
                }
            }

            System.out.println("Sparse matrix representation:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < count; j++) {
                    System.out.print(sparse[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Input matrix is not sparse");
        }
    }
}
