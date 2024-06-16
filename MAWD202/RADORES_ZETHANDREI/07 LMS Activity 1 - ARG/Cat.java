public class Cat {
    private String catType;     //empty instance variable (String)
    private int cutenessLvl;    //empty instance variable (int)
    
    //constructor with no parameters
    public Cat() {
        catType = "Unknown";
        cutenessLvl = 3;
    }
    
    //constructor with parameters
    public Cat(String type, int lvl) {
        catType = type;
        cutenessLvl = lvl;
    }
    
    //method to get the cat's cuteness level
    public int getCuteness() {
        return cutenessLvl;
    }
    
    //main method
    public static void main(String[] args) {
        //cat using the default constructor
        Cat cat1 = new Cat();
        System.out.println("Cat 1: Type = " + cat1.catType + ", Cuteness Level = " + cat1.getCuteness());
        
        //cat using the parameterized constructor
        Cat cat2 = new Cat("Birman", 5);
        System.out.println("Cat 2: Type = " + cat2.catType + ", Cuteness Level = " + cat2.getCuteness());
    }
}
