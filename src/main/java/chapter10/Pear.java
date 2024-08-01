package chapter10;

public class Pear extends Fruit {

    public Pear() {
        setCalories();
    }
    public void removeSeeds() {
        System.out.println("seeds in pear removed");
    }

    @Override
    public void makeJuice() {
        System.out.println("pear juice is great! 🍐");
    }
}
