public class Car {
    private String model;
    private String chassisNo;
    
    public static final String MAKE = "Toyota";
    public static int numCars = 0;
    

    
    
    public Car(String model){
        numCars++;
        this.chassisNo = "ch" + numCars;
        this.model = model;
        
    }
    
    public String getModel(){
        return model;
    }
    
    public void setModel(String model){
        this.model = model;
    }
    
    
    
    public String getChassisNo(){
        return chassisNo;
    }
    
    public void setChassisNo(String chassisNo){
        this.chassisNo = chassisNo;
    }
    
    @Override
    public String toString(){
        return "Car manufactured" + "\n" + "\n" + "The car is manufactured by: " + MAKE + "\n" +
               "The model type is " + model + "\n" +
               "The chassis number is " + chassisNo;
    }
    
    public static void main(String args[]) {
      
    }
}
