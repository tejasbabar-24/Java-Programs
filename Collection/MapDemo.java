package Collection;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Infosys", 100000);
        map.put("TCS", 200000);
        map.put("Congnizant", 300000);
        map.put("Wipro", 100000);

        map.put("Infosys", 210000); // Updated

        System.out.println("Infosys Emp count is " + map.get("Infosys"));

        map.remove("Congnizant");
        System.out.println(map);
        System.out.println(map.containsKey("Wipro"));

        // How to get All keys

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + "=>" + map.get(keys));
        }
    }
}
