// 08 Performance Task 1 - ARG
// This code was created by Girom Kenji R. Pacho

public class TestCar {
    public static void main(String[] args) {
        printer print = new printer();
        
        print.sop("Manufacturer: " + Car.MAKE);
        print.sop("Number of cars manufactured: " + Car.numCars);

        Car car1 = new Car("Camry");
        System.out.println(car1);

        Car car2 = new Car("Veloz");
        System.out.println(car2);


        print.sop("\nNumber of cars manufactured: " + Car.numCars);
    }
}

// adding this code for me not to write System.out.println again and again.
class printer {
    public void sop(String valparam) {
        System.out.println(valparam);
    }
}


class Car {
    public static final String MAKE = "Toyota";
    public static int numCars = 0;

    public String chassisNo;
    public String model;

    public Car(String model) {
        numCars++;
        this.chassisNo = "ch" + numCars;
        this.model = model;
        System.out.println("Car manufactured");
    }

    public void setModel(String model){
        this.model = model;
    }
    public void setChassisNo(String chassisNo){
        this.chassisNo = chassisNo;
    }
    public String getModel(){
        return this.model;
    }
    public String getChassisNo(){
        return this.chassisNo;
    }
    
    public String toString() {
        return  "\nThe car is manufactured by: " + MAKE +
                "\nThe model type is " + model +
                "\nThe chassis number is " + chassisNo;
    }
}
