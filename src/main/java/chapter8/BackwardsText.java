package chapter8;

public class BackwardsText {

    public static void main(String[] args) {
        // countWords("Dig into my brain");
        // reverseString("Hello TAU!");
        addSpaces("HeyWorld!It'sMeTodd!");
    }

    /**
     * Spilts a String into an array by tokenizing it.
     * Counts words and prints them
     * @param text Full string to be split
     */
    public static void countWords(String text) {
        var words = text.split("");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words:", numberOfWords);
        System.out.println(message);

        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void reverseString(String text) {
        for (int i=text.length()-1; i>=0; i--) {
            System.out.print(text.charAt(i));
        }
    }

    public static void addSpaces(String text) {

        var modifiedText = new StringBuilder(text);

        for (int i=0; i<modifiedText.length(); i++) {
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}
