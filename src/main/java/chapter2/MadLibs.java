package chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        // 1. Ask the user for a season during the year.
        System.out.println("Enter a season during the year.");
        String season = scanner.next();

        // 2. Ask the user for a whole number.
        System.out.println("Enter a whole number.");
        int number = scanner.nextInt();

        // 3. Ask the user for an adjective.
        System.out.println("Enter an adjective.");
        String adjective = scanner.next();

        scanner.close();

        //4. Display the results.
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " " + "cups of coffee.");
    }
}
