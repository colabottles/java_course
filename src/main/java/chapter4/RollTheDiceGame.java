package chapter4;

import java.util.Random;

public class RollTheDiceGame {

    public static void main(String[] args) {
        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 5;
        Random random = new Random();

        System.out.println("Welcome to Roll the Die! Ready to begin?");

        for (int i=1; i<=maxRolls; i++) {

            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            System.out.printf("Roll #%d: You've rolled a %d. ", i, die);

            if (currentSpace == lastSpace) {
                System.out.print("You're on space " + currentSpace + ". Congrats! You win!");
                break;
            }
            else if (currentSpace > lastSpace) {
                System.out.print("You have exceeded the " + lastSpace + " spaces. You lost.");
            }
            else if (i == maxRolls) {
                System.out.print("You are on space " + currentSpace + ".");
                System.out.print("You have not made it to all " + lastSpace + " spaces. Sorry, you lose.");
            }
            else {
                int spacesToGo = lastSpace - currentSpace;
                System.out.print("You are now on space " + currentSpace + " and have " + spacesToGo + " more to go.");
            }

            System.out.println();
        }
    }
}
