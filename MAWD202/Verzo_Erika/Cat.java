public class Cat {
    private String catType;
    private int cutenessLvl;

    public Cat() {
        this.catType = "Unknown";
        this.cutenessLvl = 3;
    }

    public Cat(String type,  int level) {
        this.catType = type;
        this.cutenessLvl = level;
    }

    // Method to get the cat's cuteness level
    public int getCuteness() {
        return this.cutenessLvl;
    }

    public static void main(String[] args) {
        Cat myCat = new Cat("Siamese", 5);
        System.out.println("My cat is a " + myCat.getCuteness() + " cuteness level Siamese cat.");
    }
}
