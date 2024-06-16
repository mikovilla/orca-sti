package car;

public class Car {
    public static final String MAKE = "Toyota";
    public static int numCars = 0;

    public String chassisNo, model = "";
    // thank god for Source Action > Generate Getters and Setters
    public String getChassisNo() {
        return this.chassisNo;
    }

    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car (String model) {
        numCars++;
        this.chassisNo = "ch" + numCars;
        this.model = model;
        System.out.println("Car manufactured");
    }

    public String toString() {return "Manufactured by " + MAKE + ", model " + this.model + ", chassis number " + this.chassisNo;}
}
