import java.util.Stack;;

public class StackExample {

    public static void main(String[] args) {
        Stack<Integer> roll_numbers = new Stack<>();

        roll_numbers.push(21);
        roll_numbers.push(22);
        roll_numbers.push(23);
        roll_numbers.push(24);

        System.out.println("Stack after pushing element :" + roll_numbers);

        // pop removes last element from stack
        int popelement = roll_numbers.pop();
        System.out.println("Stack after pop element :" + roll_numbers);

        int topelement = roll_numbers.peek();
        System.out.println("Top element is :" + topelement);

        boolean isEmpty = roll_numbers.isEmpty();
        System.out.println("is Empty :" + isEmpty);

        int size = roll_numbers.size();
        System.out.println("Size of Stack is: " + size);
    }
}
