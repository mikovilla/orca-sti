public class Cat {
    private String catType;     // Stores the type of the cat
    private int cutenessLvl;    // Stores the cuteness level of the cat

    // Public constructor without parameters, initializes with default values
    public Cat() {
        catType = "Unknown";
        cutenessLvl = 3;
    }

    // Public constructor with parameters, initializes with given values
    public Cat(String type, int lvl) {
        catType = type;
        cutenessLvl = lvl;
    }

    // Method to retrieve the cat's cuteness level
    public int getCuteness() {
        return cutenessLvl;
    }

    // Method to retrieve the cat type
    public String getCatType() {
        return catType;
    }
}
