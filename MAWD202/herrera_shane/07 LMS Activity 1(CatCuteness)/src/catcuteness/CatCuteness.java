package catcuteness;

public class CatCuteness {

    public static void main(String[] args) {
        
        Cat cat1 = new Cat();
        System.out.println("Cat Type: " + cat1.getCatType());
        System.out.println("Cuteness Level: " + cat1.getCuteness());
        // Creating a default Cat object and printing its value

        Cat cat2 = new Cat("Orange Cat", 6);
        System.out.println("Cat Type: " + cat2.getCatType());
        System.out.println("Cuteness Level: " + cat2.getCuteness());
        // Creating a Cat object with specific type and cuteness level
        
        Cat cat3 = new Cat("Tilapia Cat", 8);
        System.out.println("Cat Type: " + cat3.getCatType());
        System.out.println("Cuteness Level: " + cat3.getCuteness());
        // Creating another Cat object with specific type and cuteness level
    }
}
