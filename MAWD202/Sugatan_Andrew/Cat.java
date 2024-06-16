import java.util.Scanner;

public class Cat {
    
    
    private String catType;
    private int cutenessLvl;


      public Cat(){
          this.catType = "Unknown";
          this.cutenessLvl = 3;
      }
      
      
      public Cat(String type, int lvl){
          this.catType = type;
          this.cutenessLvl = lvl;
      }
      
      public int getCuteness(){
          return cutenessLvl;
      }
      
      
      

    public static void main(String args[]) {
        
      Cat unknownCat = new Cat();
        System.out.println("Unknown Cat Type: " + unknownCat.catType + ", Cuteness Level: " + unknownCat.getCuteness());
        
        System.out.println("Enter Cat breed");
      Scanner sc1 = new Scanner(System.in);
      
      
      String breed = sc1.nextLine();
      
      Scanner sc2 = new Scanner(System.in);
      
      System.out.println("Enter Cuteness level");
      int level = sc2.nextInt();
      
      
      Cat knownCat = new Cat(breed, level);
        System.out.println("Known Cat Type: " + knownCat.catType + ", Cuteness Level: " + knownCat.getCuteness());
    }
}
