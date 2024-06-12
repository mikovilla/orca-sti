package testcar3;

public class Car {
    public static final String MAKE = "Toyota";
    public static int numCars = 0;
    
    private String chassisNo;
    private String model;
    
    public Car(String model) {
        numCars++;
        this.chassisNo = "ch" + numCars;
        this.model = model;
        System.out.println("A new car has been created");
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
      return "The car is manufactured by: " + MAKE + "\n" +
       "Model: " + model + "\n" +
       "Chassis ID: " + chassisNo;

    }
     
    public static void numCars(){
       System.out.println("Total cars produced:: " + numCars);

}
}