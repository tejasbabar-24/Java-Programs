import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(12);
        queue.add(1);
        queue.add(45);
        queue.add(18);
        queue.add(16);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
