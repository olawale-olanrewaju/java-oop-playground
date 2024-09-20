package objectOriented.hof;

import java.util.HashMap;
import java.util.Map;

public class HofBiConsumer {

    public static void main(String[] args) {

        Map<String, Integer> coffeeRatings = new HashMap<>();
        coffeeRatings.put("Starbuck house blend", 3);
        coffeeRatings.put("Barristas mix blend", 4);
        coffeeRatings.put("Costa cappuchino", 3);
        coffeeRatings.put("Tesco value coffee", 2);
        coffeeRatings.put("Costco value coffee", 1);

        coffeeRatings.forEach((key, value) -> {
            System.out.println("Coffee " + key + " Ratings " + value); //BiConsumer takes 2 paramters and produces a side effect (x,y) -> {code}
        });
    }
}
