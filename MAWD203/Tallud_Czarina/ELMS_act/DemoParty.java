// 09 LMS Activity 1 - ARG
// This code was created by Girom Kenji R. Pacho

import java.util.Scanner;

public class DemoParty {
    public static void main(String[] args) {
        DinnerParty dinnerParty = new DinnerParty();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of guests for the dinner party: ");
        dinnerParty.setNumGuests(scan.nextInt());

        System.out.print("Enter the menu option (1 for chicken or 2 for beef): ");
        dinnerParty.setFoodChoice(scan.nextInt());

        System.out.println("The dinner party has " + dinnerParty.getNumGuests() + " guests.");
        System.out.println("Menu option " + dinnerParty.getFoodChoice() + " will be served.");

        dinnerParty.ShowInvitation();
        scan.close();
    }
}

class DinnerParty extends Party {
    private int foodChoice;

    public void setFoodChoice(int choice) {
        this.foodChoice = choice;
    }

    public int getFoodChoice() {
        return this.foodChoice;
    }

    @Override
    public void ShowInvitation() {
        System.out.println("Please come to my dinner party!");
    }
}

class Party {
    private int numGuests;

    public void setNumGuests(int num) {
        this.numGuests = num;
    }

    public int getNumGuests() {
        return this.numGuests;
    }
    public void ShowInvitation() {
        System.out.println("Please come to my party!");
    }
}
