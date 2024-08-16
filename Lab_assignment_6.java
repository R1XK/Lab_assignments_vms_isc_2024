import java.util.Scanner;

public class Lab_assignment_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking user input
        System.out.println("Enter previous and current meter readings: ");
        int prev = sc.nextInt();
        int curr = sc.nextInt();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        // calculating bill as per slab
        double cost = 0;
        int units = curr - prev;
        if (units <= 150){
            cost = units*5;
        }
        else if (units>150 && units<=400){
            cost = (150*5) + (units-150)*7.0;
        }
        else if (units>400 && units<=900){
            cost = (150*5) + (250*7) + (units-400)*10.0;
        }
        else{
            cost = (150*5) + (250*7) + (500*10) + (units-900)*12.0;
        }
        // adding tax
        cost = cost + (cost*8.5)/100.0;

        // adding senior citizen discount 
        cost = cost - (age>=60? cost*0.05 : 0.0);


        System.out.println("=====================BILL=========================");
        System.out.println("units consumed: " + units + "\tage: " + age);
        System.out.println("** Tax of 8.5% applied");
        System.out.print(age>=60? "** Senior citizen discount applied\n" : "");
        System.out.println("Total cost: Rs. " + cost);
        System.out.println("==================================================");

        sc.close();
    }
}
