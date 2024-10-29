import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExample1 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n--- Linked List Operations ---");
            System.out.println("1. Insert an element");
            System.out.println("2. Delete an element");
            System.out.println("3. Display the list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert: ");
                    int element = scanner.nextInt();
                    list.add(element);
                    System.out.println("Element added to the list.");
                    break;

                case 2:
                    System.out.print("Enter the index of the element to delete: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < list.size()) {
                        list.remove(index);
                        System.out.println("Element removed from the list.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 3:
                    System.out.println("Elements in the list: " + list);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
