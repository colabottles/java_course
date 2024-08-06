package chapter11;

public class Farm {

    public static void main(String[] args) {

        Animal mickey = new Duck();
        mickey.makeSound();

        Duck donald = new Duck();
        donald.makeSound();

        Pig porky = new Pig();
        porky.makeSound();
    }
}
