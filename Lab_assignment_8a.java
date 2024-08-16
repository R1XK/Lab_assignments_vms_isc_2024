import java.util.Scanner;

public class Lab_assignment_8a {
    // ================= PART A METHODS ==============
    // method to calculate factorial
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // method to calculate the series1
    public static void Series1(int x, int n) {
        int sum = 1; // Start with 1 as the first term of the series
    
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { // Odd index terms: subtract or add powers of x
                sum += (i % 4 == 1) ? -Math.pow(x, i) : Math.pow(x, i);
            } else { // Even index terms: add i!
                sum += factorial(i);
            }
        }
    
        // Print the result of the series
        System.out.println("The result of Series1 is: " + sum);
    }
    
    
    // method to calculate the series2
    public static double Series2(int x, int n) {
        double sum = 0.0;
    
        // Variables to generate Fibonacci sequence
        int a = 1, b = 1, c;
    
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == 2) {
                c = 1; // The first two Fibonacci numbers are 1
            } else {
                c = a + b; // Fibonacci: current term is the sum of the previous two
                a = b;
                b = c;
            }
    
            // Calculate the factorial of the Fibonacci term
            int factorialC = factorial(c);
    
            // Add the corresponding term to the sum
            sum += Math.pow(x, i) / factorialC;
        }
    
        // Return the result of the series
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ============== PART A ==============
        System.out.println("Enter option: \n<1> 1 - x + 2! - x^2 + 3! + x^3 + 4! + x^4 ... n \n<2> x + x^2 + x^3/2! + x^4/3! + x^5/5! + x^6/8!... x^n/c!");

        int opt = sc.nextInt();
        System.out.println("Enter x and n: ");
        int x = sc.nextInt();
        int n = sc.nextInt();
        
        switch (opt) {
            case 1:
                Series1(x, n);
            break;

            case 2: 
                Series2(x, n);
            break;

            default:
                System.out.println("Invalid option");
        }
        sc.close();
    }
}
