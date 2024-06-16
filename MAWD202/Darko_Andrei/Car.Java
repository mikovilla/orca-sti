public class Car {
    public static void main(String[] args) {
    }
    public static final String MAKE = "Toyota";
    public static int numCars = 1000;

    private String chassisNo;
    private String model;

    public Car(String model) {
        numCars++;
        this.chassisNo = "" + numCars;
        this.model = model;
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
        return "Make:  " + MAKE + " Model:  " + model + " Chassis No:  " + chassisNo;
    }
}
