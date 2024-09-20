package beginning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Car dodge = new Car("Dodge", 12000, 2022, "Green", new String[]{"keys", "tyre"});
//        Car nissan = new Car("Nissan", 10000, 2023, "Blue", new String[]{"keys", "tyre"});

        Scanner scanner = new Scanner(System.in);

        Car[] cars = new Car[]{
                new Car("Dodge", 12000, 2022, "Green", new String[]{"rings", "tyre"}),
                new Car("Nissan", 10000, 2023, "Blue", new String[]{"keys", "tyre"}),
                new Car("BMW", 5000, 2021, "Yellow", new String[]{"keys", "wipers"}),
                new Car("Volvo", 20000, 2023, "White", new String[]{"keys", "tyre", "wipers"})
        };

        Dealership dealership = new Dealership(cars);

        System.out.println("\n ************ JAVA DEALERSHIP! ************ \n");
        System.out.println("Feel free to browse through our collection of cars. \n");
        System.out.println(dealership);
        System.out.println("Which car are you interested in? (0 - 4).\n");
        int index = scanner.nextInt();

        dealership.sell(index);

        scanner.close();

    }
}