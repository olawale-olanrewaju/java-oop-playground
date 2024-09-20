package objectOriented.hof;

import java.util.Arrays;
import java.util.List;

public class HofStream {

    public static void main(String[] args) {

        List<Double> prices = Arrays.asList(43.45, 54.00, 32.10, 66.45, 44.32, 10.10, 213.89, 1009.32, 43.20, 54.31);
        prices.stream()
                .filter(price -> price > 20.00) // takes a Predicate x -> return Boolean
                .map(price -> price - 5)        // takes a Function, x -> apply Function
                .sorted((right, left) -> right.compareTo(left))  // takes  a Comparator, (x,y) -> return int
                .map(price -> "$" + price)
                .forEach(price -> System.out.println(price));

        //Terminal operations
        //forEach() - takes a Consumer
        //toList() -
        //reduce() - takes BinaryOperator (takes 2 parameters, returns 1 value of same type)
        //count()
        //findFirst()
    }
}
