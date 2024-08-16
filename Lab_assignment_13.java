import java.util.Scanner;

public class Lab_assignment_13 {

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

        System.out.println("Enter option: \n<1>clockwise rotation \n<2>anticlockwise rotation");
        int opt = sc.nextInt();

        int num = 1;
        switch (opt) {
            
            case 1:
            // clockwise rotation
            for (int i = n - 1; i >= 0; i--) {
                for (int j = 0; j < n; j++) {
                    arr[j][i] = num++;
                }
            }
            System.out.println("Clockwise rotated matrix: ");
            printMatrix(arr);
            break;
            
            case 2:
                // anticlockwise rotation
                for (int i = 0; i < n; i++) {
                    for (int j = n - 1; j >= 0; j--) {
                        arr[j][i] = num++;
                    }
                }
                System.out.println("Anticlockwise rotated matrix: ");
                printMatrix(arr);
            break;

            default:
                System.out.println("Invalid input");
        }
        sc.close();
    }
}
