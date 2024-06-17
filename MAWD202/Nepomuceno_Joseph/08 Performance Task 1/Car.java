public class Car {
    public static final String MAKE = "Toyota";
    
    public static int numCars = 0;
    
    private String chassisNo;
    
    private String model;

    public Car(String model) {
        this.model = model;
        numCars++;
        this.chassisNo = "ch" + numCars;
        System.out.println("Car manufactured");
    }

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

    @Override
    
    public String toString() {
        return "Make: " + MAKE + "\nModel: " + model + "\nChassis No: " + chassisNo;
    }
}