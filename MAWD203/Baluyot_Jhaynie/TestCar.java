public class TestCar {
    public static void main(String[] args) {
        System.out.println("Manufacturer: " + Car.MANUFACTURER);
        System.out.println("Number of cars manufactured: " + Car.getNumCars());
        System.out.println("Car manufactured\n");

        Car car1 = new Car("Camry");
        System.out.println(car1.toString());
        System.out.println("Car manufactured\n");

        Car car2 = new Car("Veloz");
        System.out.println(car2.toString());
        System.out.println();

        System.out.println("Number of cars manufactured: " + Car.getNumCars());
    }
}

public class Car {
    public static final String MANUFACTURER = "Toyota";
    private static int numCars = 0;
    private String chassisNo;
    private String model;

    public Car(String model) {
        numCars++;
        this.chassisNo = "ch" + numCars;
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

    public static int getNumCars() {
        return numCars;
    }

    @Override
    public String toString() {
        String header = "======= " + model + " =======";
        String divider = "==============================";
        return divider + "\n" + header + "\nMake: " + MANUFACTURER + "\nChassis Number: " + chassisNo + "\n" + divider;
    }
        
}
