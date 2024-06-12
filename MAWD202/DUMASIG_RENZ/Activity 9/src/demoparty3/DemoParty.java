package demoparty3;
import java.util.Scanner;

public class DemoParty {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        DinnerParty DP = new DinnerParty();
      try{  
        System.out.println("Enter the number of guests for the dinner party: ");
        int numGuest = scn.nextInt();
        DP.setNumguest(numGuest);

        System.out.println("Enter the menu option (1 for Pancit Canton, 2 for Kaning Lamig, 3 for Lugaw, 4 for watatops): ");
        int foodchoise = scn.nextInt();
        DP.setFoodChoise(foodchoise);

        System.out.println("\nThe dinner party has " + DP.getNumguest() + " guests.");
        System.out.println("Menu option " + DP.getFoodChoise() + " will be served, YUM!");

        DP.showInvitation();
        scn.close(); }
      catch(Exception e) {
             System.out.println("Something went wrong, Type mo kasi ng maayos!");
}
    }
}

