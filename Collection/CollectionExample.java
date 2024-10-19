import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        // Create a list using the ArrayList class
        List<String> fruits = new ArrayList<>();

        // Adding elements to the list
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Mango");

        // Print the list
        System.out.println("Original list: " + fruits);

        // Sorting the list alphabetically
        Collections.sort(fruits);

        // Print the sorted list
        System.out.println("Sorted list: " + fruits);

        // Removing an element from the list
        fruits.remove("Banana");

        // Print the list after removal
        System.out.println("List after removal: " + fruits);
    }
}
