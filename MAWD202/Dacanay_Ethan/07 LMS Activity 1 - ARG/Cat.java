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

    public String getCatType() {
        return this.catType;
    }

    public void setCatType(String catType) {
        this.catType = catType;
    }

    public void setCutenessLvl(int cutenessLvl) {
        this.cutenessLvl = cutenessLvl;
    }

    public static void main(String[] args) {
        Cat defaultCat = new Cat();
        System.out.println("Default Cat Type: " + defaultCat.getCatType());
        System.out.println("Default Cuteness Level: " + defaultCat.getCuteness());

        Cat customCat = new Cat("Persian", 10);
        System.out.println("Custom Cat Type: " + customCat.getCatType());
        System.out.println("Custom Cuteness Level: " + customCat.getCuteness());
    }
}
