import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(4);
        set1.add(3);
        set1.add(2);
        set1.add(1);
        System.out.println(set1);
        System.out.println("Total Elements: " + set1.size());
        set1.remove(4);
        System.out.println(set1.contains(14));

        for (Integer i : set1) {
            System.out.println(i);
        }
        Iterator it = set1.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
