package chapter5;
/*
 * METHODS EXAMPLE:
 * Write a method that asks a user for their name and then displays a greeting to that user by name.
 */

import java.util.Scanner;

public class Greetings {

    public static void main(String[] args) {

        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        scanner.close();
        greetUser(name);
    }

    public static void greetUser(String name) {
        System.out.println("Hi there, " + name);
    }
}
