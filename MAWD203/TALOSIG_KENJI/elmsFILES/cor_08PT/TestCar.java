package cor_08PT;

public class TestCar {
    public static void main(String [] args) {
        System.out.println("Manufacturer: " + Car.MAKE);
        System.out.println("Number of cars manufactured: " + Car.numCars);

        Car car1 = new Car("Camry");
        System.out.println(car1);
        
        Car car2 = new Car("Velos");
        System.out.println(car2);
        

        System.out.println("Number of cars manufactured: " + Car.numCars);
    }
}

class Car {
    public static final String MAKE = "Toyota";
    public static int numCars = 0;
    public String chassisNo, model;

    public Car(String model0) {
        numCars++;
        chassisNo = "ch" + numCars;
        model = model0;
        System.out.println("Car Manufactured");
    }

    public void setModel(String model1) {
        model = model1;
    }

    public void setChassisNo(String chassisNo0) {
        chassisNo = chassisNo0;
    }

    public String getModel() {
        return model;
    }

    public String getChassisNo() {
        return chassisNo;
    }

    public String toString() {
        return  "\nThe car is manufactured by: " + MAKE +
                "\nThe model type is " + model +
                "\nThe chassis number is " + chassisNo;
    }
}
