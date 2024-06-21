// 07 LMS Activity 1 - ARG
// This code was created by Girom Kenji R. Pacho

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
        return this.cutenessLvl;
    }

    //? Do you need this code below? if yes, consider this code below. 
    public String getCatType() {
        return this.catType;
    }
}
