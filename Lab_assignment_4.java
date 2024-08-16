import java.util.Scanner;

public class Lab_assignment_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ‘I’ or ‘F’: ");
        char ch = sc.next().charAt(0);
        ch = Character.toUpperCase(ch);

        // Taking input from user
        System.out.println("Enter weight of package: ");
            int wt = sc.nextInt();
        System.out.println("Enter rate per gram: ");
            int rate = sc.nextInt();
        System.out.println(ch == 'I'? "Enter Speacial tax amount: " : "");
            int tax = sc.nextInt();
        
        // calculating cost using Ternary
        int cost = (wt*rate) + (ch == 'I'? tax : 0);

        // printing the total cost
        System.out.println("Total cost: " + cost);
        sc.close();
    }
}
