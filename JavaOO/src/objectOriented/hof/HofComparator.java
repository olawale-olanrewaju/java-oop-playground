package objectOriented.hof;

import java.util.Arrays;
import java.util.List;

public class HofComparator {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(23, 45, 54, 37, 98, 12, 29);

        integers.sort((right, left) -> right.compareTo(left)); //Comparator takes 2 paramteer and returns an integer (x,y) -> {return int}
    }
}
