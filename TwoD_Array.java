import java.util.Scanner;

public class TwoD_Array {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        int row = 3;
        int cols = 3;
        
        int[][] matrix = new int[row][cols]; // Changed variable name to matrix for consistency
        System.out.println("Enter Matrix Elements: ");
        
        // Reading matrix elements
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = obj.nextInt(); // Correctly assign values to the matrix
            }
        }
        
        System.out.println("Matrix Elements: ");
        
        // Printing matrix elements
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " "); // Print each element with a space
            }
            System.out.println(); // Move to the next line after each row
        }
        
        obj.close(); // Close the scanner to prevent resource leaks
    }
}
