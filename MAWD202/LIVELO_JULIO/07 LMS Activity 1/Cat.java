public class Cat {
    private String catType;
    private int cutenessLvl;

    public Cat() {
        catType = "Unknown";
        cutenessLvl = 3;
    }

    public Cat(String type, int lvl) {
        catType = type;
        cutenessLvl = lvl;
    }

    public int getCuteness() {
        return cutenessLvl;
    }
}