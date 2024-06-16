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

    
    public int getCuteness() {
        return cutenessLvl;
    }

    
    public static void main(String[] args) {
        
        Cat unknownCat = new Cat();
        System.out.println("Unknown cat type's cuteness level: " + unknownCat.getCuteness());

        
        Cat specificCat = new Cat("Persian", 5);
        System.out.println("Persian cat's cuteness level: " + specificCat.getCuteness());
    }
}
