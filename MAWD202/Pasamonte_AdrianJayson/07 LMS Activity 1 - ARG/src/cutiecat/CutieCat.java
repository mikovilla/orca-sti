package cutiecat;

public class CutieCat {

    public static void main(String[] args) {
       
        Cat cat1 = new Cat();
        System.out.println("Cat Type: " + cat1.getCatType());
        System.out.println("Cuteness Level: " + cat1.getCuteness());


        Cat cat2 = new Cat("British Shorthair", 10);
        System.out.println("Cat Type: " + cat2.getCatType());
        System.out.println("Cuteness Level: " + cat2.getCuteness());
    }
    
}