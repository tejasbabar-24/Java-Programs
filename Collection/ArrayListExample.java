import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Displaying the ArrayList
        System.out.println("Fruits list: " + fruits);

        // Accessing an element from the ArrayList
        String firstFruit = fruits.get(0);
        System.out.println("First fruit in the list: " + firstFruit);

        // Removing an element from the ArrayList
        fruits.remove("Banana");
        System.out.println("Fruits list after removing Banana: " + fruits);

        // Iterating through the ArrayList using a for loop
        System.out.println("Iterating through the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Checking if the ArrayList contains a specific element
        if (fruits.contains("Mango")) {
            System.out.println("The list contains Mango.");
        } else {
            System.out.println("Mango is not in the list.");
        }

        // Size of the ArrayList
        System.out.println("Total number of fruits in the list: " + fruits.size());
    }
}
