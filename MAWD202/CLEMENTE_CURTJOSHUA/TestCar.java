package car;

public class TestCar {
    public static void main(String[] args) {
        System.out.println("Manufacturer: " + Car.MAKE);

        Car car1 = new Car("Camry");
        System.out.println(car1);
        Car car2 = new Car("Velroz");
        System.out.println(car2);

        System.out.println("Cars manufactured: " + Car.numCars);


    }
}
