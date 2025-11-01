import java.util.Scanner;

public class SparceMatric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix size
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print the matrix
        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Count zeros and non-zeros
        int zeroCount = 0, nonZeroCount = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0)
                    zeroCount++;
                else
                    nonZeroCount++;
            }
        }

        // Check sparse matrix condition
        if (zeroCount > nonZeroCount) {
            System.out.println("\nThe given matrix is a Sparse Matrix.");
        } else {
            System.out.println("\nThe given matrix is NOT a Sparse Matrix.");
        }

        // Print Sparse Matrix Representation (row, col, value)
        System.out.println("\nSparse Matrix Representation (row col value):");
        System.out.println("Row Col Value");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != 0) {
                    System.out.println(i + "   " + j + "   " + matrix[i][j]);
                }
            }
        }
    }
}
