package chapter14;

public class Player {

    private String name;
    private String guess;

    public Player(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGuess() {
        return guess;
    }

    public boolean setGuess() {
        this.guess = guess;
        return false;
    }
}
