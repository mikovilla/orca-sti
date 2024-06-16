package testcar;

public class Car {
    public static final String MAKE = "Toyota"; // Static variable to store the car make, final to prevent modification
    public static int numCars = 0; // Static variable to keep track of the number of cars manufactured

    private String chassisNo; // Instance variable to store the chassis number
    private String model; // Instance variable to store the car model

    // Constructor with a single parameter for the car model
    public Car(String model) {
        Car.numCars++; // Increment the number of cars manufactured
        this.chassisNo = "ch" + Car.numCars; 
        this.model = model; 
        System.out.println("Car manufactured"); 
    }

    // Getter for the model
    public String getModel() {
        return model;
    }

    // Setter for the model
    public void setModel(String model) {
        this.model = model;
    }

    // Getter for the chassis number
    public String getChassisNo() {
        return chassisNo;
    }

    // Setter for the chassis number
    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }

    // toString method to display the car's make, model, and chassis number
    @Override
    public String toString() {
        return "Car Manufacturer: " + MAKE + "\n" +
               "Car Model: " + model + "\n" +
               "Chassis Number: " + chassisNo;
    }
}
