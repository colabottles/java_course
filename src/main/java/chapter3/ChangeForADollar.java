package chapter3;

import java.util.Scanner;

public class ChangeForADollar {

    public static void main(String[] args) {

        int pennies = 1;
        int nickels = 5;
        int dimes = 10;
        int quarters = 25;
        int dollar = 100;

        int currentCents = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of pennies:");
        currentCents += scanner.nextInt() * pennies;

        System.out.println("Enter the number of nickels:");
        currentCents += scanner.nextInt() * nickels;

        System.out.println("Enter the number of dimes:");
        currentCents += scanner.nextInt() * dimes;

        System.out.println("Enter the number of quarters:");
        currentCents += scanner.nextInt() * quarters;

        scanner.close();

        // If the user is short of a dollar
        if (currentCents < dollar) {
            double amountShort = dollar - currentCents;
            System.out.println("Sorry, you lost. You were short " + String.format("%.2f", amountShort / 100) + " dollar(s).");
        }
        // If user is over a dollar
        else if (currentCents > dollar) {
            double amountOver = currentCents - dollar;
            System.out.println("Sorry, you lose! You went over by " + String.format("%.2f", amountOver / 100) + " dollar(s).");
        }
        // User inputs coins exactly one dollar
        else {
            System.out.println("You got exactly $1.00! You win!");
        }

    }
}
