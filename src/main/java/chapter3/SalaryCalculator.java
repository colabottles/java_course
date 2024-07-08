package chapter3;

import java.util.Scanner;

public class SalaryCalculator {

    /*
    *
    * If statement.
    * All salespeople get a payment of $1000/week.
    * Salespeople who exceed 10 sales get an additional bonus of $250.
    *
    */

    public static void main(String args[]) {

        // Initialize known values
        int salary = 1000;
        int bonus = 250;
        // int bonusDbl = 500;
        int quota = 10;
        // int quotaDbl = 20;

        // Get values for the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // Quick detour for the bonus earners
        if (sales > quota) {
            salary = salary + bonus;
        }

        /* if (sales > quotaDbl) {
         *   salary = (bonus + bonusDbl) + salary;
         * }
         */

        // Output the result
        System.out.println("The employee's pay is $" + salary);

    }
}
