// Eddie Hart
// Jan 26th, 2024
// CSC 1060

import java.util.Scanner;

// This allows to use the scanner method.
public class InteractiveGreeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.nextLine();
        // Asks for user's name and stores it as a string in "name".
        System.out.println("Where are you from? ");
        String origin = input.nextLine();
        // Asks for user's origin and stores it as a string in "origin".
        System.out.println("How old are you? (years) ");
        String age = input.nextLine();
        // Asks for user's age and stores it as a string in "age".
        System.out.println("Hello " + name + " from " + origin + "." + " You are " + age + " years old.");
        // Uses the user's inputs to greet them.
        System.out.println("What is something you like to do? ");
        String hobby = input.nextLine();
        // Asks for user's hobby and stores it as a string in "hobby".
        System.out.println("Have fun next time you " + hobby + "!");
        // Quick reply to user with their input.

        System.out.println("How much would you like to donate today?");
        String donation = input.nextLine();
        // Asks for user's donation quantity and stores it as a string in "donation".
        System.out.println("You will donate $" + donation + " today. Yay!");
        // You get the point.
    }
}