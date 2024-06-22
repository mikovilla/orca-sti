public class Cat {
    public static void main (String[] args);
    private String catType;
    private int cutenessLvl;

    // Constructor without parameters
    public Cat() {
        this.catType = "Unknown";
        this.cutenessLvl = 3;
    }

    // Constructor with parameters
    public Cat(String type, int lvl) {
        this.catType = type;
        this.cutenessLvl = lvl;
    }

    // Method to get the cat's cuteness level
    public int getCuteness() {
        return cutenessLvl;
    }

    // Getter and Setter for catType
    public String getCatType() {
        return catType;
    }

    public void setCatType(String catType) {
        this.catType = catType;
    }

    // Getter and Setter for cutenessLvl
    public int getCutenessLvl() {
        return cutenessLvl;
    }

    public void setCutenessLvl(int cutenessLvl) {
        this.cutenessLvl = cutenessLvl;
    }
}
