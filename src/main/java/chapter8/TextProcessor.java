package chapter8;

public class TextProcessor {

    public static void main(String[] args) {
        countWords("You a step away from frozen, stiff as if ya posing\n" + "Dig into my brain as the rhyme gets chosen");
    }

    /**
     * Splits a String ino an array by tokenizing it.
     * Counts words and prints them
     * @param text Full string to be split
     */
    public static void countWords(String text) {
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words:", numberOfWords);
        System.out.println(message);

        for (String word : words) {
            System.out.println(word);
        }
    }
}
