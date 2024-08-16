import java.util.Scanner;

public class Lab_assignment_11 {

    // method to print the 2D matrix
    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of square matrix: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        // Taking input of positive integers for a matrix
        System.out.println("Enter elements of matrix (ONLY POSITIVE NUMBERS): ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = sc.nextInt();
                while (num <= 0) { // Check if the number is not positive
                    System.out.println("Please enter a positive number: ");
                    num = sc.nextInt(); // Take input again until it's positive
                }
                arr[i][j] = num;
            }
        }

        // Printing the matrix
        System.out.println("Original matrix: ");
        printMatrix(arr);

        // roating the matrix 90deg clockwise
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[n - 1 - j][i];
                arr[n - 1 - j][i] = arr[n - 1 - i][n - 1 - j];
                arr[n - 1 - i][n - 1 - j] = arr[j][n - 1 - i];
                arr[j][n - 1 - i] = temp;
            }
        }

    // Printing the rotated matrix
    System.out.println("Rotated matrix: ");
    printMatrix(arr);

        sc.close();
    }
}
