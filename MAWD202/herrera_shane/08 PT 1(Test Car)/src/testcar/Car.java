package testcar;

public class Car {
    public static final String MAKE = "Toyota";
    public static int numCars = 0;
    // Initializing Variables and its value
    
    private String chassisNo;
    private String model;
    // Declaring Private variable
    
    public Car(String model) {
        numCars++;
        this.chassisNo = "ch" + numCars;
        this.model = model;
        System.out.println("Car manufactured");
    }
    //created public constructor that increment the value of numCars
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }
    //Created Setter and Getter Method to access model and ChasisNo
    
    @Override
    public String toString() {
        return "The car is manufactured by " + MAKE + "\n" +
               "The model type is " + model + "\n" +
               "The chassis number is " + chassisNo;
    }
    //Created String tostring method
     
    public static void numCars(){
        System.out.println("The total number of cars manufactured is "+numCars);
    }
}
