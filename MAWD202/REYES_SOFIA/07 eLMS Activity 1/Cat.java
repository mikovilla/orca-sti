// 07 elms act 1
public class Cat {
    // Declare instance variables
    private String catType;
    private int cutenessLvl;
    
    public Cat() {
        this.catType = "Unknown";
        this.cutenessLvl = 3;
    }

    public Cat(String type, int lvl) {
        this.catType = type;
        this.cutenessLvl = lvl;
    }
    
    public int getCuteness() {
        return this.cutenessLvl;
    }
    
    public static void main(String[] args) {
        // Create a Cat object using default constructor
        Cat defaultCat = new Cat();
        System.out.println("Default Cat: ");
        System.out.println("Cat type: " + defaultCat.catType);
        System.out.println("Cuteness level: " + defaultCat.getCuteness());
        
        Cat customCat = new Cat("British shorthair", 3);
        System.out.println("\nCustom Cat: ");
        System.out.println("Cat type: " + customCat.catType);
        System.out.println("Cuteness level: " + customCat.getCuteness());
    }
}
