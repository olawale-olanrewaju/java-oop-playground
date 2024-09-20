package objectOriented.collections.map;

import beginning.Car;
import java.util.HashMap;
import java.util.Map;
import static beginning.Car.TrafficLight.*;

public class EqualityCheck {

    public static void main(String[] args) {

        Map<Car, String> carVim = new HashMap<>();

        carVim.put(new Car("Honda", 1000, 2021, "Green", new String[]{"keys"}), "WER3333333333");
        carVim.put(new Car("Benz", 2000, 2021, "White", new String[]{"keys"}), "WER4444444444");
        carVim.put(new Car("BMW", 3000, 2021, "Red", new String[]{"keys"}), "WER5555555555");
        carVim.put(new Car("Volvo", 4000, 2021, "Pink", new String[]{"keys"}), "WER666666666");
        carVim.put(new Car("Tesla", 5000, 2021, "Black", new String[]{"keys"}), "WER7777777777");

        System.out.println(carVim.containsKey(new Car("Honda", 1000, 2021, "Green", new String[]{"keys"})));
        System.out.println(carVim.values());
        System.out.println(carVim.keySet());
        System.out.println(Car.getCarCount());
        System.out.println(RED);
        System.out.println(GREEN);
        System.out.println(YELLOW);
    }
}
