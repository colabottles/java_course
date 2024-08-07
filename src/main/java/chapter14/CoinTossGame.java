package chapter14;

import java.util.Scanner;

public class CoinTossGame {

    private Scanner scanner;

    public static void main(String[] args) {
        CoinTossGame game = new CoinTossGame();
        game.scanner = new Scanner(System.in);

        Player player1 = new Player(game.askPlayerName());
        player1.setGuess();

        Player player2 = new Player(game.askPlayerName());
        player2.setGuess();

        System.out.println("Flipping the coin...");
        Coin coin = new Coin();
        coin.flip();
        System.out.println("The coin landed on " + coin.getSide());

        game.determineWinner(player1, player2, coin);
        game.scanner.close();
    }

    private String askPlayerName() {
        System.out.println("Enter the player's name:");
        return scanner.nextLine();
    }

    private void determineWinner(Player player1, Player player2, Coin coin) {
        String winner;
        if (coin.getSide().equalsIgnoreCase(player1.getGuess())) {
            winner = player1.getName();
        } else {
            winner = player2.getName();
        }

        System.out.println("The winner is " + winner);
    }
}
