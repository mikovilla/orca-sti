public class TestCar {
    public static void main(String[] args) {
        System.out.println("Manufacturer: " + Car.MAKE);
        System.out.println("Initial number of manufactured cars: " + Car.numCars);

        
        Car car1 = new Car("Camry");
        Car car2 = new Car("Veloz");

    
        System.out.println("\nCar 1:\n" + car1);
        System.out.println("\nCar 2:\n" + car2);

        
        System.out.println("\nTotal number of cars manufactured: " + Car.numCars);
    }
}
