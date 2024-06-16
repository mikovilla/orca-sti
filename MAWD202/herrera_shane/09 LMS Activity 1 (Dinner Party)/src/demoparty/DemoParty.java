package demoparty;
import java.util.Scanner;
public class DemoParty {

   public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        DinnerParty DP = new DinnerParty();
        try {
            System.out.println("Enter the number of guests for the dinner party: ");
            int numGuests = scn.nextInt();
            DP.setNumGuests(numGuests);

            System.out.println("Enter the menu option (1 for chicken, 2 for fish, 3 for steak, 4 for pasta, 5 for salad): ");
            int foodChoice = scn.nextInt();
            DP.setFoodChoice(foodChoice);

            System.out.println("\nThe dinner party has " + DP.getNumGuests() + " guests.");
            System.out.println(DP.getDishName() + " will be served.");

            DP.showInvitation();
            scn.close();
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}
