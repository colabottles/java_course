package chapter6;

public class HomeAreaCalculator {

    public static void main(String[] args) {

        // Create instance of Rectangle class
        Rectangle room1 = new Rectangle(50, 25);
        double areaOfRoom1 = room1.calculateArea();

        // Create Rectangle 2
        Rectangle room2 = new Rectangle(130, 75);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("Area of both rooms: " + totalArea);
    }
}