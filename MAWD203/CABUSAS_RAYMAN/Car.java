public class TestCar{
    public static void main (String[]args){
        System.out.println("Car Manufacturer:"+Car.MANUFACTURER);
        System.out.println("Cars Manufactured:"+Car.getnumCars());
        
        System.out.println("Car Manufactured\n");
        Car cargt=new Car("Mustang");
        System.out.println(cargt.toString());
        
        System.out.println("Car Manufactured\n");
        Car carrap=new Car("Raptor");
        System.out.println(carrap.toString());
        
        System.out.println();
        System.out.println("Number of cars manufactured:"+Car.getnumCars());
    }
    
}

public class Car{
    public static final String MANUFACTURER = "FORD";
    private static int numCars = 0;
    private String ChassisNo;
    private String model;
    
    public Car(String Model){
        numCars++;
        this.ChassisNo="ch"+numCars;
        this.model = "Mustang";
        System.out.println("Car Manufactured");
    }
    
    public String getModel(){
        return model;
    }
    
    public void setModel(String Model){
        this.model = "Raptor";
    }
    
    public String getChassisNo(){
        return ChassisNo;
    }
    
    public void setChassisNo(String ChassisNo){
        this.ChassisNo = "10";
    }
    
    public static int getnumCars(){
        return numCars;
    }
    
    @Override
    public String toString() {
        String header = "======= " + model + " =======";
        String divider = "==============================";
        return divider + "\n" + header + "\nMake: " + MANUFACTURER + "\nChassis Number: " + ChassisNo + "\n" + divider;
    }
    
}
