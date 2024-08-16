import java.util.Scanner;

public class Lab_assignment_8b {
     // ================= PART A METHODS ==============
     // method to calculate the 1st series
     public static double Series(int x, int n) {
        double sum = 0.0;
        int sign = 1;  // Start with positive sign
    
        for (int i = 1, factorial = 1, power = 1; i <= n; i++, power++) {
            factorial *= (2 * i - 1) * (2 * i - 2);  // Calculate factorial of odd numbers (3!, 5!, 7!, etc.)
            
            sum += sign * factorial / Math.pow(x, power);
            sign *= -1;  // Alternate the sign
        }
    
        return sum;
    }
    
    // method to calculate the 2nd series
    public static double series(int x, double n) {
        double sum = 0.0;
        int pow1 = 1;  // Powers of x (1, 2, 3, ...)
        int pow2 = 3;  // Powers of x (3, 5, 7, ...)
    
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {  // For odd terms
                sum += Math.sqrt(Math.pow(x, pow1));
                pow1++;  // Increment power for next term
            } else {  // For even terms
                sum += Math.sqrt(Math.pow(x, pow2));
                pow2 += 2;  // Increment power for next odd term
            }
        }
        return sum;
    }
    
    
    public static void main(String[] args) {
                // ============== PART B ==============
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter option: \n<1> 1/x - 3!/x^2 + 5!/x^3 - 7!/x^4 ... \n<2> sqrt(x) + sqrt(x^3) + sqrt(x^2) + sqrt(x^5) + sqrt(x^3) + sqrt(x^7)...");
                int opt = sc.nextInt();

                switch (opt) {
                    case 1:
                        System.out.println("Enter x and n: ");
                        int x1 = sc.nextInt();
                        int n1 = sc.nextInt();
                        System.out.println("The result of the series is: " + Series(x1, n1));
                    break;

                    case 2:
                        System.out.println("Enter x and n: ");
                        int x2 = sc.nextInt();
                        double n2 = sc.nextInt();
                        System.out.println("The result of the series is: " + series(x2, n2));
                    break;

                    default:
                        System.out.println("Invalid option");
                }
                sc.close();
    }
}
