import java.util.Scanner;

public class Lab_assignment_14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of square matrix: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        // Filling the matrix with Pascal's triangle
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }

        // Printing the matrix with center alignment
        for (int i = 0; i < n; i++) {
            // Print leading spacest
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");  
            }
            // Print the actual numbers
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }

        sc.close();
    }
}
