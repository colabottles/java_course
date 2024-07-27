package chapter9;

public class TasteTester {

    public static void main(String[] args) {

        Cake cake = new Cake("dark chocolate");
        cake.setPrice(29.95);
        System.out.println("Regular cake flavor: " + cake.getFlavor());
        System.out.println("Regular cake price: " + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setPrice(39.95);
        System.out.println("Flavor of birthday cake: " + birthdayCake.getFlavor());
        System.out.println("Price of birthday cake: " + birthdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setFlavor("french vanilla");
        System.out.println("Flavor of wedding cake: " + weddingCake.getFlavor());
        System.out.println("Price of wedding cake: " + weddingCake.getPrice());
    }
}
