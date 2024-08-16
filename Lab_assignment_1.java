import java.util.Scanner;

class Lab_assignment_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter your school name: ");
        String school = sc.nextLine();

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your class: ");
        String cls = sc.nextLine(); 

        System.out.println("Enter your section: ");
        char sec = sc.next().charAt(0);

        System.out.println("Enter your roll number: ");
        int roll = sc.nextInt();

        System.out.println("Enter your subject: ");
        String sub = sc.next();

        System.out.println("Enter your session: ");
        String session = sc.next();
        // Done taking input

        // printing label
        System.out.println("==========================LABEL=============================");
        System.out.println("name:\t" + name + "\nclass: " + cls + "\tsection: " + sec + "\troll no: " + roll + "\nsubject: " + sub + "\nsession: " + session + "\nschool: " + school); 
        System.out.println("============================================================");

        sc.close();
    }
}