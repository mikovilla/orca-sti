public class Car {
    public static String MAKE = "Toyoya";
    public static int numCars = 0;

    private String chassisNo;
    private String model;

    public Car(String model) {
        chassisNo = "ch" + ++numCars;
        this.model = model;
        System.out.println("Car Manufactured");
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

    public String toString() {
        return "The car is manufactured by: " + MAKE + "\nThe model type is " + model + "\nThe chassis number is "
                + chassisNo;
    }
}
