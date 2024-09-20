package objectOriented.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListStudy {

    public static void main(String[] args) {

        List<String> cities = new LinkedList<>();
        cities.add("Lagos");
        cities.add("Ogun");
        cities.add("Ondo");

        System.out.println(cities.get(2));
    }
}
