package chapter10;

public class Fruit {

    /*
     *
     * FRUIT MARKET
     * 1. Create a class called Fruit This class should contain a field called calories and a method called makeJuice
     * which prints a statement (e.g., juice is made).
     * 2. Create two subclasses of the Fruit class (e.g., Apple, Banana) and create method(s) in these classes that
     * are specific to them (e.g., removeSeeds, peel). Set the calories within the constructors of these subclasses.
     * Override the makeJuice method to print the specific type of juice that is made.
     * 3. Create a Market class which testes polymorphism by creating several variations of these objects.
     *
     */

    private int calories;

    public int calories() {
        return calories;
    }

    public void setCalories() {
        this.calories = calories;
    }

    public void makeJuice() {
        System.out.println("Juice is made.");
    }
}