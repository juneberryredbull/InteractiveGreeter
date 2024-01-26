// Eddie Hart
// Jan 26th, 2024
// CSC 1060

import java.util.Scanner;

public class InteractiveGreeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?" );
        String name = input.nextLine();
        System.out.println("Where are you from? ");
        String origin = input.nextLine();
        System.out.println("How old are you? (years) ");
        String age = input.nextLine();
        System.out.println("Hello " + name + " from " + origin + "." + " You are " + age + " years old.");

        System.out.println("What is something you like to do? ");
        String hobby = input.nextLine();
        System.out.println("Have fun next time you " + hobby + "!");
        System.out.println("How much would you like to donate today?");
        String donation = input.nextLine();
        System.out.println("You will donate $" + donation + " today. Yay!");


    }
}