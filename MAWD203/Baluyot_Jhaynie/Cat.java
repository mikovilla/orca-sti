//#1
public class Cat {
    private String catType;
    private int cutenessLvl;
//#2
    public Cat() {
        this.catType = "Unknown";
        this.cutenessLvl = 3;
    }
//#3
    public Cat(String catType, int cutenessLvl) {
        this.catType = catType;
        this.cutenessLvl = cutenessLvl;
    }
//#4
    public String getCatType() {
        return catType;
    }

    public void setCatType(String catType) {
        this.catType = catType;
    }

    public int getCutenessLvl() {
        return cutenessLvl;
    }

    public void setCutenessLvl(int cutenessLvl) {
        this.cutenessLvl = cutenessLvl;
    }

    public int getCuteness() {
        return cutenessLvl;
    }
//final touches
    public static void main(String[] args) {
        Cat myCat = new Cat("Unknown", 3);
        System.out.println("Cat Type: " + myCat.getCatType());
        System.out.println("Cuteness Level: " + myCat.getCutenessLvl());
//extra cat, reminds me my friends

        System.out.println("------------------------------------------------------");
        
        Cat soralboCat = new Cat("Soralbo the kitty", 10);
        System.out.println("Cat Type: " + soralboCat.getCatType());
        System.out.println("Gyatt Level: " + soralboCat.getCutenessLvl());
        
        System.out.println("------------------------------------------------------");
        
        Cat ryanCat = new Cat("Puma Ryan", 8);
        System.out.println("Cat Type: " + ryanCat.getCatType());
        System.out.println("Kulot Level: " + ryanCat.getCutenessLvl());
    
    }
}
