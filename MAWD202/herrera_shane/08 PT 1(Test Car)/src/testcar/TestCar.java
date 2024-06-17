package testcar;

public class TestCar {

    public static void main(String[] args) {
        System.out.println("Manufacturer: " + Car.MAKE);
        System.out.println("Initial number of cars manufactured: " + Car.numCars);

        Car car1 = new Car("Camry");
        System.out.println(car1);

        Car car2 = new Car("Veloz");
        System.out.println(car2);

        Car.numCars();
        
        /* final output: 
           Manufacturer: Toyota
           Initial number of cars manufactured: 0
           Car manufactured
           The car is manufactured by Toyota
           The model type is Camry
           The chassis number is ch1
           Car manufactured
           The car is manufactured by Toyota
           The model type is Veloz
           The chassis number is ch2
           The total number of cars manufactured is 2 */
    }
}
