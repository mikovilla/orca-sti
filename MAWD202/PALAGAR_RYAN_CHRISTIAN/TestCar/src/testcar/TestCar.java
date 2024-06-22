package testcar;

public class TestCar 
{
    public static void main(String[] args) 
    {
        System.out.println("Manufacturer: " + Car.MAKE);
        System.out.println("Number of cars manufactured: " + Car.numCars);
        //Tested access of static variable
        
        Car car1 = new Car("Camry");
        System.out.println(car1);
        //Print the details of car1
        
        Car car2 = new Car("Veloz");
        System.out.println(car2);
        //Print the details of car2
        
        System.out.println("\nNumber of cars manufactured: " + Car.numCars);
        //Check the number of cars
        
        car2.setModel("LFA");
        car2.setChassisNo("21");
        //Tested getter and setter
        
        System.out.println("\n" + car2);
        //Printed car2 with custom value
        
        /*SAMPLE OUTPUT
        Manufacturer: Toyota
        Number of cars manufactured: 0
        Car manufactured

        The car is manufactured by: Toyota
        The model type is Camry
        The chassis number is ch1
        Car manufactured

        The car is manufactured by: Toyota
        The model type is Veloz
        The chassis number is ch2

        Number of cars manufactured: 2

        The car is manufactured by: Toyota
        The model type is LFA
        The chassis number is 21
        */
    }
    
}
