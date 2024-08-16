import java.util.Arrays;
import java.util.Scanner;

public class Lab_assignment_10 {
    // method to sort the array in ascending order using selection sort
    public static void selection(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // swapping
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    // method to search a number in an array using binary search
    public static void biSearch(int[] arr, int key) {
            int l = 0;
            int r = arr.length - 1;
        
            while (l <= r) {
                int mid = l + (r - l) / 2;  
        
                if (arr[mid] == key) {
                    System.out.println("Found " + key + " at index: " + mid);
                    return;  // Exit the method once the key is found
                } 
                else if (arr[mid] > key) {
                    r = mid - 1;
                } 
                else {
                    l = mid + 1;
                }
            }
            
            // If the loop exits without finding the key
            System.out.println("Key " + key + " not found in the array.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        // taking array elements as input
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Unsorted array: " + Arrays.toString(arr));

        // Sorting the array using selection sort
        selection(arr);

        // searching a number in an array using binary search
        System.out.println("Enter number to search: ");
        int key = sc.nextInt();
        biSearch(arr, key);

        sc.close();
    }
}
