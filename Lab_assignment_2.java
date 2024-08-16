import java.util.Scanner;

public class Lab_assignment_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking user input
        System.out.println("Enter values for a, b, c and d: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        // calculating x
        double x = ((a+b)/5) * (c/7) - d;

        // printing the result
        System.out.println("x = " + x);

        sc.close();
    }
}
