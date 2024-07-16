package chapter5;

// TODO:
/* PHONE BILL CALCULATOR
 * 1. Calculate the final total of someone's cell phone bill.
 * 2. Allow the operator to input the plan fee and the number of overage minutes.
 * 3. Charge the user 0.25 for every minute they were over their plan, and 15% tax on the subtotal.
 * 4. Create separate methods to calculate the tax, overage fees, and final total.
 * 5. Print the itemized bill.
 */

import java.util.Scanner;

public class PhoneBillCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter the plan price
        System.out.println("Please enter the base price of the plan:");
        double baseCost = scanner.nextDouble();

        // Enter the overage minutes
        System.out.println("Please enter overage minutes:");
        double overageMinutes = scanner.nextDouble();

        // Close the scanner
        scanner.close();

        // Calculate all the numbers!
        double overageCharge = calculateOverages(overageMinutes);
        double tax = calculateTax(baseCost + overageCharge);

        calculateAndPrintBill(baseCost, overageCharge, tax);
    }

    // Get the calculation for overage minutes
    public static double calculateOverages(double extraMinutes) {
        double rate = 0.25;
        return extraMinutes * rate;
    }

    // Get the calculation for the tax
    public static double calculateTax(double subtotal) {
        double rate = 0.15;
        double tax = subtotal * rate;
        return tax;
    }

    // Calculate and print the final bill
    public static void calculateAndPrintBill(double base, double overage, double tax) {
        double finalTotal = base + overage + tax; // Final bill calculation

        System.out.println("Your Phone Bill Statement");
        System.out.println("Plan total: $" + String.format("%.2f", base));
        System.out.println("Overage total: $" + String.format("%.2f", overage));
        System.out.println("Tax total: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", finalTotal));
    }
}
