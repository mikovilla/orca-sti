package party_09LMSACTIVITY;

import java.util.Scanner;
public class DemoParty {
    public static void main(String [] args) {
        DinnerParty dinnerParty = new DinnerParty();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of guests for the dinner party: ");
        dinnerParty.setNumGuests(scan.nextInt());

        System.out.print("Enter the menu option (1 for chicken or 2 for beef): ");
        dinnerParty.setFoodChoice(scan.nextInt());

        System.out.println("The dinner party has " + dinnerParty.getNumGuests() + " guests.");
        System.out.println("Menu option " + dinnerParty.getFoodChoice() + " will be served.");

        dinnerParty.ShowInvitation();
    }
    
}

class DinnerParty extends Party {
    private int foodChoice;
    public void setFoodChoice(int choice) {
        foodChoice = choice;
    }
    public int getFoodChoice() {
        return foodChoice;
    }
    @Override
    public void ShowInvitation() {
        System.out.println("Please come to my dinner party!");
    }
}

class Party {
    private int numGuests;

    public void setNumGuests(int num) {
        numGuests = num;
    }
    public int getNumGuests() {
        return numGuests;
    }
    public void ShowInvitation() {
        System.out.println("Please come to my party!");
    }
}
