package Lesson11;

public class Main {

    public static void main(String[] args) {

        PassengerCar passcar = new PassengerCar();
        TruckCar truckCar = new TruckCar();
        Cars cars = new Cars();

        cars.type();
        cars.color();

        passcar.type();
        passcar.color();

        truckCar.type();
        truckCar.color();

    }
}
