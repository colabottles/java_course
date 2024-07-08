package chapter3;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String args[]) {

        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message = switch (grade) {
            case "A" -> "Excellent job!";
            case "B" -> "Great job!";
            case "C" -> "Good job!";
            case "D" -> "You need to work a bit harder.";
            case "F" -> "Uh oh!";
            default -> "Invalid grade error.";
        };

        System.out.println(message);
    }
}
