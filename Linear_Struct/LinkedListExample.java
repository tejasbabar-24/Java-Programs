import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList of strings
        LinkedList<String> list = new LinkedList<>();

        // Adding elements to the linked list
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // Printing elements in the linked list
        System.out.println("Linked List elements:");
        for (String language : list) {
            System.out.print(language + " ");
        }
    }
}
