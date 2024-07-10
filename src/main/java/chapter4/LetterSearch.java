package chapter4;

/*
 * LOOP BREAK
 * Search a string to determine if it contains the letter 'A'.
 */

import java.util.Scanner;

public class LetterSearch {

    public static void main(String[] args) {

        // Get text
        System.out.println("Enter some text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        // Search text for the letter 'A'
        for (int i=0; !letterFound && i<text.length(); i++) {
            char currentLetter = text.charAt(i);
            // break;
            letterFound = switch (currentLetter) {
                case 'A', 'a' -> true;
                default -> false;
            };
        }

        if (letterFound) {
            System.out.println("This text contains the letter 'A'");
        }
        else {
            System.out.println("This text does not contain the letter 'A'");
        }
    }
}
