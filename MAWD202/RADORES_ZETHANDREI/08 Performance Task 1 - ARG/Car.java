public class Car {
    public static final String MAKE = "Toyota";
    public static int numCars = 0;
    
    private String chassisNo;
    private String model;
    
    //constructor with model parameter
    public Car(String model) {
        numCars++;  //incrementing numCars
        this.chassisNo = "ch" + numCars;
        this.model = model;
    }
    
    //getter and setter for model
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    //getter and setter method for chassisNo
    public String getChassisNo() {
        return chassisNo;
    }
    
    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }
    
    //toString method to display make model and chassis number
    @Override
    public String toString() {
        return "The car is manufactured by: " + MAKE + "\n" +
               "The model type is " + model + "\n" +
               "The chassis number is " + chassisNo;
    }
}
