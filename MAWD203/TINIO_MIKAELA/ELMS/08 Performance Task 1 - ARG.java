 public class TestCar {
    public static void main (String[] args){
        System.out.println("Manufacturer: " + Car.MAKE);
        System.out.println("Manufactured: " + Car.numCars);
        Car CARa= new Car("Camry");
        Car CARb= new Car("Veloz");
        System.out.println(CARa);
        System.out.println(CARb);
        System.out.println("//Total number of cars manufactured: " + Car.numCars);
    }
}

 class Car {
    public static final String MAKE = "Toyota";
    public static int numCars = 0;
    public String chassisNo;
    public String model;
    public Car(String model){
        numCars++;
        this.chassisNo = "ch" + numCars;
        this.model = model;
        System.out.println("//Car manufactured");
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    public void setChassisNo(String chassisNo){
        this.chassisNo = chassisNo;
    }
    public String getChassisNo(){
        return chassisNo;
    }
    public String toString(){
        return "//The car is manufactured by: " + MAKE + "\nThe model is " + model + "\nThe Chassis No is " + chassisNo;
    }
}
 
