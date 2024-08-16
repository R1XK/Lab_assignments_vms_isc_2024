import java.util.Scanner;

public class Lab_assignment_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking user input
        System.out.println("Enter option: \n<1>°C to °F \n<2>°F to °C \n<3>°F to K");
        int opt = sc.nextInt();
        System.out.println("Enter tempererature: ");
        int temp = sc.nextInt();

        // converting temperature
        switch (opt) {
            case 1:
                System.out.println(temp + "°C = " + (temp * 9 / 5) + 32 + "°F");
                break;
            case 2:
                System.out.println(temp + "°F = " + (temp - 32) * 5 / 9 + "°C");
                break;
            case 3:
                System.out.println(temp + "°F = " + (temp - 32) * 5 / 9 + 273.15 + "K");
                break;
            default:
                System.out.println("Invalid option");
        }

        sc.close();
    }
}
