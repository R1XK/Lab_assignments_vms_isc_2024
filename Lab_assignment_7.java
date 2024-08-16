import java.util.Scanner;

public class Lab_assignment_7 {

    // method for calculatinf fibonacci series upto n terms
    public static void fibonacci(int n) {
        int a = 1, b = 1, c = 0;
        System.out.print(a + " " + b);
        for (int i = 1; i <= n; i++) {
            c = a + b;
            System.out.print(c + " ");
            //swapping
            a = b;
            b = c;
        }
    }

    // method for checking if a number is prime or not
    public static boolean isPrime(int num) {
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // method for checking if a number is twisted prime or not
    public static void TwistedPrimeChk(int num) {
        int temp = num;
        int rev = 0;
        while (temp > 0) {
            int d = temp % 10;
            rev = rev * 10 + d;
            temp /= 10;
        }
        if(isPrime(num) && isPrime(rev)) {
            System.out.println(num + " is twisted prime, as its reverse is " + rev + " is also prime");
        }
        else {
            System.out.println(num + " is not twisted prime");
        }
    }

    // method for checking is a number is perfect number or not
    public static void PerfectChk(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println(num + " is a perfect number");
        }
        else {
            System.out.println(num + " is not a perfect number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter option: \n<1> Fibonacci Series \n<2> Twisted Prime \n<3> Perfect Number");
        int opt = sc.nextInt();

        // checking as per the option
        switch(opt){
            case 1:
                System.out.println("Enter no. of terms: ");
                int n = sc.nextInt();
                fibonacci(n);
            break;

            case 2:
                System.out.println("Enter number: ");
                int num = sc.nextInt();
                TwistedPrimeChk(num);
            break;

            case 3:
                System.out.println("Enter number: ");
                int num1 = sc.nextInt();
                PerfectChk(num1);
            break;  
            
            default:
                System.out.println("Invaldi option");
        }
        sc.close();
    }
}
