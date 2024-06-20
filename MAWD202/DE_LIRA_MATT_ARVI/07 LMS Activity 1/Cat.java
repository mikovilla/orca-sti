public class Cat {
    private int cutenessLvl;
    public String catType;

    public Cat() {
        cutenessLvl = 3;
        catType = "Unknown";
    }

    public Cat(int lvl, String type) {
        cutenessLvl = lvl;
        catType = type;
    }

    public int getCuteness() {
        return cutenessLvl;
    }
}