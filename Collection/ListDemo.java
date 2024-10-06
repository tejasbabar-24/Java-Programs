package Collection;

import java.util.*;

public class ListDemo {
    /**
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<String> list2 = new ArrayList<String>();

        list1.add(1);
        list1.add(17);
        list1.add(31);
        list1.add(12);
        list2.add("Mumbai");
        list2.add("Pune");
        list2.add("Sangli");
        list2.add("Goa");

        System.out.println(list1);

        list1.add(21);// insert at end
        System.out.println(list1);

        System.out.println(list2);
        list2.add("kohlapur");
        System.out.println(list2);

        list1.remove(2);// Remove
        System.out.println("After removing element :" + list1);

        list1.set(0, 100);
        System.out.println("After Updateing" + list1);

        // Collection.sort(list2);

        System.out.println(list2.contains("Pune"));
        System.out.println("After Sorting:" + list2);

        // for loop
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i)); // Read
        }
        // foreach
        for (String data : list2) {
            System.out.println(data);
        }

        // Using Iterator
        ListIterator<Integer> it = list1.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
