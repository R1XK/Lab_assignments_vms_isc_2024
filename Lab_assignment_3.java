import java.util.Scanner;

public class Lab_assignment_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ‘I’ or ‘F’: ");
        char ch = sc.next().charAt(0);
        ch = Character.toUpperCase(ch);

        // cost calculation as per the input
        int cost = 0;
        if(ch == 'I'){  
            System.out.println("Enter weight of package: ");
            int wt = sc.nextInt();
            System.out.println("Enter rate per gram: ");
            int rate = sc.nextInt();

            cost = wt*rate;
        } 
        else if(ch == 'F'){
            System.out.println("Enter weight of package: ");
            int wt = sc.nextInt();
            System.out.println("Enter rate per gram: ");
            int rate = sc.nextInt();
            System.out.println("Enter speacial tax amount: ");
            int tax = sc.nextInt();

            cost = (wt*rate) + tax;
        } 
        else {
            System.out.println("Inviulid input");
        }

        // printing the total cost
        System.out.println("Total cost: " + cost);
        sc.close();
    }
}
