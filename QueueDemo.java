import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

class QueueDemo {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue);
    }
}