package beginning;

import java.util.Arrays;
import java.util.Objects;

public class Car {

    private String make;
    private double price;
    private int year;
    private String colour;
    private String[] parts;

    private static int carCount = 0;
    public enum TrafficLight {GREEN, RED, YELLOW}

    public Car(String make, double price, int year, String colour, String[] parts){
        carCount++;
        this.make = make;
        this.price = price;
        this.year = year;
        this.colour = colour;
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    public Car(Car source){
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.colour = source.colour;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", colour='" + colour + '\'' +
                ", parts=" + Arrays.toString(parts) +
                '}';
    }

    public String[] getParts() {
        return Arrays.copyOf(this.parts, this.parts.length);
    }

    public void setParts(String[] parts) {
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && year == car.year && Objects.equals(make, car.make) && Objects.equals(colour, car.colour) && Arrays.equals(parts, car.parts);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(make, price, year, colour);
        result = 31 * result + Arrays.hashCode(parts);
        return result;
    }

    public void drive(){
        System.out.println("Congratulations!!! You just bought the " + colour + " " + year + " " + make);
        System.out.println("Drive it to the nearest exits");
    }

    public static int getCarCount(){
        return carCount;
    }
}