import java.util.Arrays;
import java.util.Scanner;

public class Lab_assignment_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        // taking array elements as input
        System.out.println("Enter elements of array (ONLY NEGATIVE NUMBERS): ");
        int ind = 0;    
        while (ind < size) {
            int n = sc.nextInt();
            if (n < 0) {
                arr[ind] = n;
                ind++;
            }
        }
        System.out.println("Unsorted Array: " + Arrays.toString(arr));

        // sorting array in ascending order using bubble sort
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // searching element using linear search
        System.out.println("Enter element to be searched: ");
        int key = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                System.out.println("found " + key + " at index: " + i);
            }
        }
        sc.close();
    }
}
