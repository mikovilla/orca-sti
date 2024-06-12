package testcar3;
public class TestCar {

    public static void main(String[] args) {
        System.out.println("Manufacturer: " + Car.MAKE);
        System.out.println("Number of cars initially produced: " + Car.numCars);

        Car camry = new Car("Camry");
        System.out.println(camry);
        
        
        Car veloz = new Car("Veloz");
        System.out.println(veloz);

         Car.numCars();
    }

    
}