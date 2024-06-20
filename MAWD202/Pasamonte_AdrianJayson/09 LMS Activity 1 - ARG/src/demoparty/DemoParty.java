package demoparty;

import java.util.Scanner;

public class DemoParty {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        DinnerParty DP = new DinnerParty();

        System.out.println("Enter the number of guests for the dinner party: ");
        int numGuest = scn.nextInt();
        DP.setNumguest(numGuest);

        System.out.println("Enter the menu option (1 for pizza, 2 for burger, 3 for chicken): ");
        int foodchoise = scn.nextInt();
        DP.setFoodChoise(foodchoise);

        System.out.println("\nThe dinner party has " + DP.getNumguest() + " guests.");
        System.out.println("Menu option " + DP.getFoodChoise() + " will be served.");

        DP.showInvitation();
        scn.close();
    }
}
