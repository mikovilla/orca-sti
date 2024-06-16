public class Cat {
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

    
    public int getCutenes() {
        return this.cutenessLvl;
    }
}
public static void main(String[] args) { 
Cat cat1 = new Cat();
System.out.println("Cat 1 type: " + cat1.catType); 
System.out.println("Cat 1 cuteness level: " + cat1.getCuteness());   

Cat cat2 = new Cat("Bengal", 6);   
System.out.println("Cat 2 type: " + cat2.catType);   
 System.out.println("Cat 2 cuteness level: "  + cat2.getCuteness()); }  }

