package chapter3;

/*
 *
 * NESTED IF STATEMENTS
 * To qualify for a loan, a person must make $30,000 a year
 * and have been working at their current job for at least 2 years.
 *
 */

import java.util.Scanner;

public class LoanCalculator {

    public static void main(String args[]) {

        // Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        // Get what we don't know
        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer:");
        double years = scanner.nextDouble();

        scanner.close();

        // Make the decision
        if (salary >= requiredSalary) {
            if (years >= requiredYearsEmployed) {
                System.out.println("Congrats! You qualify for the loan!");
            } else {
                System.out.println("Sorry. The requirements for the loan were not met. You must have worked at your current job "
                        + requiredYearsEmployed + " years.");
            }
        }
        else {
            System.out.println("Sorry. You must earn at least $" + requiredSalary + " to qualify for the loan.");
        }

    }
}
