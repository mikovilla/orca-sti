public class TestCar {
    public static void main(String[] args) {
        //Initial values
        System.out.println("Manufacturer: " + Car.MAKE);
        System.out.println("Number of cars manufactured: " + Car.numCars);
        System.out.println("Car manufactured\n");
        
        //After instantiating first Car object
        Car car1 = new Car("Camry");
        System.out.println(car1);
        System.out.println("Car manufactured\n");
        
        //After instantiating second Car object
        Car car2 = new Car("Veloz");
        System.out.println(car2);
        System.out.println();
        
        //Total number of cars manufactured
        System.out.println("Number of cars manufactured: " + Car.numCars);
    }
}
