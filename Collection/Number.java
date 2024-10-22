import java.util.ArrayList;

public class Number {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        System.out.println("Fruits in the ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        fruits.remove("Banana");

        System.out.println("\nAfter removing 'Banana':");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        String firstFruit = fruits.get(0);
        System.out.println("\nFirst fruit in the list: " + firstFruit);

        if (fruits.contains("Orange")) {
            System.out.println("\n'Orange' is present in the list.");
        } else {
            System.out.println("\n'Orange' is not present in the list.");
        }

        System.out.println("\nTotal number of fruits: " + fruits.size());
    }
}
