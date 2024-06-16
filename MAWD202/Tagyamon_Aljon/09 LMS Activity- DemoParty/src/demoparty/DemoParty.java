package demoparty;
import java.util.Scanner;

public class DemoParty {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        DinnerParty dp = new DinnerParty();
      try{  
        System.out.println("Enter the number of guests for the dinner party: ");
        int numGuest = scn.nextInt();
        dp.setNumguest(numGuest);

        System.out.println("Enter the menu option (1 for Roast Beef, 2 for Grilled Salmon, 3 for Lasagna): ");
        int foodchoise = scn.nextInt();
        dp.setFoodChoise(foodchoise);

        System.out.println("\nThe dinner party has " + dp.getNumguest() + " guests.");
        System.out.println("Menu option " + dp.getFoodChoise() + " will be served.");

        dp.showInvitation();
        scn.close(); }
      catch(Exception e) {
             System.out.println("Enter Valid Number From The Choises");
}
    }
}
