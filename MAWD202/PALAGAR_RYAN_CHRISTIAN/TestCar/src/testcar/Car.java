package testcar;

public class Car 
{
    
    public static final String MAKE = "Toyota";
    public static int numCars = 0;
    
    String chassisNo;
    String model;
    
    public Car(String model)   
    { 
      numCars++;
      this.model = model; 
      this.chassisNo = "ch" + numCars;
      System.out.println("Car manufactured\n");
    }
    
    public int getNumCars()
    {
        return numCars;
    }

    public String getChassisNo()
    {
        return chassisNo;
    }

    public void setModel(String model)
    {
        this.model = model;
    }
    
    public String getModel()         
    {
      return this.model;
    } 
    
    public void setChassisNo(String no)
    {
        this.chassisNo = no;
    }
    
    public String toString()
    {
        return "The car is manufactured by: " + MAKE + "\nThe model type is " + model + "\nThe chassis number is " + chassisNo;
    }
}