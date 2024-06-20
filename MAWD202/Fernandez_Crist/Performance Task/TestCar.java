package testcar;
public class TestCar {
    public static void main(String[] args) {
        // Display the initial values
        System.out.println("Manufacturer: " + Car.MAKE);
        System.out.println("Number of cars manufactured: " + Car.numCars);
        System.out.println();

        // Instantiate the first Car object
        Car car1 = new Car("Camry");
        System.out.println(car1);
        System.out.println();

        // Instantiate the second Car object
        Car car2 = new Car("Veloz");
        System.out.println(car2);
        System.out.println();

        // Display the total number of cars manufactured
        System.out.println("Number of cars manufactured: " + Car.numCars);
    }
}

