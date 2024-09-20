package objectOriented.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapStudy {

    public static void main(String[] args) {

        Map<Integer, Integer> tree = new TreeMap<>();
        int multiplier = 5;
        tree.put(1, multiplier*1);
        tree.put(2, multiplier*2);
        tree.put(3, multiplier*3);
//        tree.put(null, null);

        System.out.println(tree.get(3));
        System.out.println(tree.values());
    }
}
