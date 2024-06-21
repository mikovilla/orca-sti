package MAWD202.NARANJO_RHENZ.PerformanceTask1;

public class Car {
    public static final String MAKE = "Toyota";
    public static int numCars = 0;
    private String chassisNo;
    private String model;

    public Car(String model){
        numCars++;
        chassisNo = "ch" + numCars;
        this.model = model;
        System.out.println("Car Manufactured");
    }

    public String getChassisNo() {
        return chassisNo;
    }
    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String toString(){
        return "The car is manufactured by: " + MAKE + "\n" +
               "The model type is " + model + "\n" +
               "The chassis number is " + chassisNo;
    }
}

