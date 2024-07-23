package chapter7;

import java.util.Scanner;

/*
 * Make an array that holds the textual values of the days of the week.
 * Have the user input a number corresponding to the day of the week. Assuming the week starts on Monday.
 * The program should output the String that represents the day of the week.
 * Example: User inputs the number 1, the program should print "Monday".
 */

public class DayOfTheWeek {

    public static void main(String[] args) {
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for the day of the week.");
        int index = input.nextInt();
        input.close();

        System.out.println("The number you submitted is for the day: " + week[index - 1]);
    }
}
