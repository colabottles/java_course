package chapter10;

public class Market {

    public static void main(String[] args) {

        Pear pear = new Pear();
        pear.removeSeeds();

        Pear pear2 = new Pear();
        pear2.removeSeeds();

        Mango mango = new Mango();
        mango.peel();

        Fruit mango2 = new Mango();
        mango.peel();

        Fruit orange = new Fruit();

        squeeze(pear);
        squeeze(mango);
        squeeze(mango2);
        squeeze(orange);

    }

    public static void squeeze(Fruit fruit) {
        System.out.println("Squeezing...");
        fruit.makeJuice();
    }
}
