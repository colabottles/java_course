package chapter5;

/*
 * VARIABLE SCOPE
 * Write an instant credit check program that approves
 * anyone who makes $25,000 or more a year and has a credit score
 * of 700 or better. Rejecting all others.
 */

import java.util.Scanner;

public class InstantCreditCheck {

    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String [] args) {

        // Get what we don't know
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        // Check if the user is qualified
        boolean qualified = isUserQualified(creditScore, salary);

        // Notify the user
        notifyUser(qualified);

    }

    public static double getSalary() {
        System.out.println("Enter your salary:");
        return scanner.nextDouble();  // Simplified and changed
    }

    public static int getCreditScore() {
        System.out.println("Enter your credit score:");
        return scanner.nextInt(); // Simplified and changed
    }

    public static boolean isUserQualified(int creditScore, double salary) {
        return creditScore >= requiredCreditScore && salary >= requiredSalary; // Simplified and changed
    }

    public static void notifyUser(boolean isQualified) {
        if (isQualified) {
            System.out.println("Congratulations! You have been approved!");
        }
        else {
            System.out.println("Sorry. You have been declined.");
        }
    }
}
