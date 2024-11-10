/*Name: Francis Obeng-Mensah
 * School: University of Maryland Baltimore County
 * Class: IS147
 * Exam 3 problem 1
 * The MatrixOperations program allows the user to create a square matrix based on user-defined size and integer inputs. 
 * It then displays the matrix using nested loops. Finally, it calculates and prints the sum of each row in the matrix.
 */

 import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // This asks the user for the size of the square matrix
        System.out.print("Enter the size of the square matrix: ");
        int size = scanner.nextInt();

        int[][] matrix = new int[size][size];

        //  This also asks the user to input the values for the matrix
        System.out.println("Enter the values for the matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Prints out the matrix
        System.out.println("The matrix is:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Calculates and prints the sum of each row
        for (int i = 0; i < size; i++) {
            int rowSum = 0;
            for (int j = 0; j < size; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
        }

        scanner.close();
    }
}
