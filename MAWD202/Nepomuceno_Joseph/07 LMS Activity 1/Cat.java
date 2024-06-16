package cat;

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
}