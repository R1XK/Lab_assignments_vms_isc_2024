import java.util.Scanner;

public class Lab_assignment_15 {

    // method to check if the number is prime or not
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // method to circulate the number
    public static int circulate(int n, int div) {
        if (n < 10)
            return n;
        else
            return (n % div) * 10 + n / div;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int num = sc.nextInt();
        // check if the number is positive
        while (num < 0) {
            System.out.println("Please Enter a positive number: ");
            num = sc.nextInt();
        }

        int len = 0, div = 1, temp = num;
        boolean allPrime = true;

        // Calculate the number of digits and divisor part
        for (int i = num; i > 0; i /= 10) {
            len = len + 1;
            div *= 10;
        }
        div /= 10;

        do {
            temp = circulate(temp, div);

            if (isPrime(temp)) {
                System.out.println(temp + " is prime.");
            } else {
                System.out.println(temp + " is not prime.");
                allPrime = false;
            }
        } while (temp != num);

        if (allPrime)
            System.out.println("Hence, " + num + " is a Circular Prime number.");
        else
            System.out.println("Hence, " + num + " is not a Circular Prime number.");

        sc.close();
    }
}
