package testcar;

public class TestCar {

    public static void main(String[] args) {
        System.out.println("Manufacturer: " + Car.MAKE);
        System.out.println("Number of cars manufactured:: " + Car.numCars);

        Car c1 = new Car("Camry");
        System.out.println(c1);

        Car c2 = new Car("Veloz");
        System.out.println(c2);

        Car.numCars();
    }
}
