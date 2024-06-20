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
    
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        System.out.println("Cat 1: Type = " + cat1.catType + ", Cuteness Level = " + cat1.getCuteness());
        
        Cat cat2 = new Cat("Maine Coon", 8);
        System.out.println("Cat 2: Type = " + cat2.catType + ", Cuteness Level = " + cat2.getCuteness());
    }
}
