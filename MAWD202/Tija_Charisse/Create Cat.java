public class Cat {
    String catType;
    int cutenessLvl;

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

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        System.out.println("Cat 1 type: " + cat1.catType);
        System.out.println("Cat 1 cuteness level: " + cat1.getCuteness());

        Cat cat2 = new Cat("Russian Blue", 8);
        System.out.println("Cat 2 type: " + cat2.catType);
        System.out.println("Cat 2 cuteness level: " + cat2.getCuteness());
    }
}
