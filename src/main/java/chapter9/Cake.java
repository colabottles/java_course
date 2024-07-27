package chapter9;

/*
 * MULTIPLE INHERITANCE
 * 1. Create a superclass called Cake that has two fields: flavor and price, and a constructor that accepts the flavor.
 * Getter and setter methods should be created for the fields.
 * 2. Create a BirthdayCake class which inherits from Cake and has a field called candles.
 * Its constructor should set the flavor. Include getter and setter method.
 * 3. Create a WeddingCake class which inherits from Cake and has a field called tiers. Its constructor should set the
 * flavor. Include getter and setter methods.
 * 4. Create a TasteTester class to test out your inheritance by printing the flavor and price of each of these types of
 *  cakes.
 */

public class Cake {

    private String flavor;
    private double price;

    public Cake(String flavor) {
        setFlavor(flavor);
        setPrice(249.95);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
