package chapter12;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
        // setDemo();
        // listDemo();
        // queueDemo();
        mapDemo();
    }

    public static void setDemo() {
        Set<String> fruit = new HashSet();
        fruit.add("apple");
        fruit.add("pear");
        fruit.add("orange");
        fruit.add("banana");
        fruit.add("pear");

        System.out.println(fruit.size());
        System.out.println(fruit);

        var i = fruit.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        for (String item: fruit) {
            System.out.println(item);
        }

        fruit.forEach(System.out::println);
    }

    public static void listDemo() {
        List fruit = new ArrayList();
        fruit.add("apple");
        fruit.add("pear");
        fruit.add("orange");
        fruit.add("banana");
        fruit.add("pear");

        System.out.println(fruit.get(2));
        System.out.println(fruit.size());
        System.out.println(fruit);
    }

    public static void queueDemo() {
        Queue fruit = new LinkedList();
        fruit.add("apple");
        fruit.add("pear");
        fruit.add("orange");
        fruit.add("banana");
        fruit.add("pear");

        System.out.println(fruit.size());
        System.out.println(fruit);

        fruit.remove();
        System.out.println(fruit);

        System.out.println(fruit.peek());
    }

    public static void mapDemo() {
        Map<String, Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("pear", 102);
        fruitCalories.put("orange", 45);
        fruitCalories.put("banana", 105);
        fruitCalories.put("pear", 100);

//        System.out.println(fruitCalories.size());
//        System.out.println(fruitCalories);
//
//        System.out.println(fruitCalories.get("pear"));
//
//        System.out.println(fruitCalories.entrySet());
//
//        fruitCalories.remove("orange");
//        System.out.println(fruitCalories);

        for (var entry: fruitCalories.entrySet()) {
            System.out.println(entry.getValue());
        }

        fruitCalories.forEach(
                (k,v) -> System.out.println("Fruit: " + k + ", Calories: " + v)
        );
    }

    public void print(Collection<String> collection) {
        var i = collection.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        for (String item : collection) {
            System.out.println(item);
        }

        collection.forEach(System.out::println);
    }

    public void print(Map<String, Integer> map) {
        for (var entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }

        map.forEach(
                (k,v)->System.out.println("Fruit: " + k + ", calories: " + v));
    }
}
