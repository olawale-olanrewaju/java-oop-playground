package objectOriented;

import beginning.Car;

import java.util.ArrayList;
import java.util.List;

public class EqualityCheck {

    public static void main(String[] args) {

        Car benz = new Car("Benz", 1000, 2022, "Green", new String[]{"tyres", "keys"});
//        Car bmw = new Car(benz);
//
//        System.out.println(benz.equals(bmw)); //Uses == which compares the references

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Benz", 1000, 2022, "Green", new String[]{"tyres", "keys"}));
        cars.add(new Car("bmw", 1000, 2022, "Green", new String[]{"tyres", "keys"}));
        cars.add(new Car("volvo", 1000, 2022, "Green", new String[]{"tyres", "keys"}));
        cars.add(new Car("honda", 1000, 2022, "Green", new String[]{"tyres", "keys"}));

        System.out.println(cars.contains(benz));

    }
}
