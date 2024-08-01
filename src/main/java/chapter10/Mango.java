package chapter10;

public class Mango extends Fruit {

    public Mango() {
        setCalories();
    }
    public void peel() {
        System.out.println("remove the mango skin before eating");
    }

    @Override
    public void makeJuice() {
        System.out.println("mango juice is great! 🥭");
    }
}
