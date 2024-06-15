package MAWD202.NARANJO_RHENZ.PerformanceTask1;

public class TestCar {
    public static void main(String[] args) {
        System.out.println("\n--Initial Values--");
        System.out.println("Manufacturer: " + Car.MAKE);
        System.out.println("Number of Cars Manufactured: " + Car.numCars);
        // System.out.println("Car Manufactured");

        Car car1 = new Car("Camry");
        System.out.println("\n--After instantiating the first Car object--");
        System.out.println(car1);
  

        Car car2 = new Car("Veloz");
        System.out.println("\n--After instantiating the second Car object--");
        System.out.println(car2);

        System.out.println("\n--Total Numbers of Car Manufactured--");
        System.out.println("Number of Cars Manufactured: " + Car.numCars);
        
    }
}
