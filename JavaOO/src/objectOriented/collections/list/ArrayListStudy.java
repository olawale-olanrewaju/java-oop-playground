package objectOriented.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStudy {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Lagos");
        cities.add("Oyo");
        cities.add("Ogun");

        System.out.println("The List size is " + cities.size());
        System.out.println("The first element is " + cities.get(0));
    }
}
