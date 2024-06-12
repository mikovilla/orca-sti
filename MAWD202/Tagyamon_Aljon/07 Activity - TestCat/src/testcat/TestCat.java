package testcat;

public class TestCat {
    public static void main(String[] args) {
        
        Cat type1 = new Cat();
        System.out.println("Cat Type: " + type1.getCatType());
        System.out.println("Cuteness Level: " + type1.getCuteness());
        // Default cat Value

        Cat type2 = new Cat("Persian Cat", 9);
        System.out.println("Cat Type: " + type2.getCatType());
        System.out.println("Cuteness Level: " + type2.getCuteness());
        // Overloaded New Value
    }
}
