package beginning;

public class Dealership {

    private Car[] cars;

    public Dealership(Car[] cars){
        this.cars = new Car[cars.length];

        for(int i = 0; i < this.cars.length; i++){
            this.cars[i] = new Car(cars[i]);
        }
    }

    @Override
    public String toString() {
        String temp = "";
        for (int i = 0; i < this.cars.length; i++){
            temp += "\nParking Spot:" + i + "\n";
            String carDescription = this.cars[i].toString();
            temp += carDescription + "\n";
        }
        return temp;
    }

    public void sell(int index){
        this.cars[index].drive();
    }
}
