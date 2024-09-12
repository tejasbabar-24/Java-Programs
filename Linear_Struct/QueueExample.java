import java.util.LinkedList;
import java.util.Queue;

class QueueExample {
    public static void main(String[] args) {
        Queue<String> names = new LinkedList<>();

        names.add("Ram");
        names.add("Siya");
        names.add("Sham");
        names.add("Krishna");

        System.out.println("Queue after enquing in element:" + names);

        String dequedelemnt = names.poll();
        System.out.println("Dequed Element " + dequedelemnt);// Ram
        System.out.println("Queue after enquing in element:" + names);// [Siya, Sham, Krishna]

        String frontelement = names.peek();
        System.out.println(frontelement);// siya

        int size = names.size();
        System.out.println("Size of Queue is :" + size);// 3

        boolean isEmpty = names.isEmpty();
        System.out.println(isEmpty);// false
    }

}