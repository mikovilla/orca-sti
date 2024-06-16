package car;

public class TestCar {
    public static void main(String[] args) {
        System.out.println("Manufacturer: " + Car.MAKE);
        System.out.println("Initial Number of Manufactured Cars: " + Car.numCars);
        
        Car car1 = new Car("Camry");
        Car car2 = new Car("Veloz");
        
        System.out.println(car1);
        System.out.println(car2);
        
        System.out.println("Total Number of Cars Manufactured: " + Car.numCars);
    }
}