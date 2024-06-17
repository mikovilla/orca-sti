package demoparty;
import java.util.Scanner;

public class DemoParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DinnerParty dinnerParty = new DinnerParty();

        // Prompt user for the number of guests
        System.out.print("Enter the number of guests for the dinner party: ");
        int numGuests = scanner.nextInt();
        dinnerParty.setNumGuests(numGuests);

        // Prompt user for the menu option
        System.out.print("Enter the menu option (1 for sinigang or 2 for adobo): ");
        int foodChoice = scanner.nextInt();
        dinnerParty.setFoodChoice(foodChoice);

        // Display the details of the dinner party
        System.out.println();
        System.out.println("The dinner party has " + dinnerParty.getNumGuests() + " guests.");
        System.out.println("Menu option " + dinnerParty.getFoodChoice() + " will be served.");
        
        // Display the invitation message
        dinnerParty.showInvitation();

        scanner.close();
    }
}
