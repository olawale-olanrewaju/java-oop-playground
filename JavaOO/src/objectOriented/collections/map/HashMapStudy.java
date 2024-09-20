package objectOriented.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapStudy {

    public static void main(String[] args) {
        Map<String, Double> inventory = new HashMap<>();
        inventory.put("banana", 1.0);
        inventory.put("apple", 2.0);
        inventory.put("lime", 2.5);

//        System.out.println(inventory.get("apple"));
//        System.out.println(inventory.containsValue(3.5));
//        System.out.println(inventory.values());

        String response = inventory.containsValue(3.5) ? "Yes" : "Sorry, False";

        System.out.println(response);
    }
}
