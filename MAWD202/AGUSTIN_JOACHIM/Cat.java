class Cat {
    private String catType;
    private int cutenessLvl;

    public Cat() {
        this.catType = "Unknown";
        this.cutenessLvl = 3;
    }

    public Cat(String catType, int cutenessLvl) {
        this.catType = catType;
        this.cutenessLvl = cutenessLvl;
    }

    public int getCuteness() {
        return cutenessLvl;
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();

        System.out.println("Cat Cuteness Level: " + myCat.getCuteness());
        // added a main method so the program can atleast output something.
       
    }
}
