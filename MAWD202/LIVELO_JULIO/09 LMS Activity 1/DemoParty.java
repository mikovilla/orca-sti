import java.util.Scanner;

public class DemoParty {
    public static void main(String[] args) {
        while (true) {

            try {
                Scanner scn = new Scanner(System.in);
                DinnerParty party1 = new DinnerParty();
                System.out.print("Enter the number of guests for the dinner party: ");
                party1.setNumGuests(scn.nextInt());
                System.out.print("Enter the menu option (1 for chicken or 2 for beef): ");
                party1.setFoodChoice(scn.nextInt());
                System.out.println("The dinner party has " + party1.getNumGuests() + " guests.");
                System.out.println("Menu option " + party1.getFoodChoice() + " will be served");
                party1.showInvitation();
                break;
            } catch (Exception e) {
                System.out.println("Wrong Input, Try Again");
            }
        }
    }

}
