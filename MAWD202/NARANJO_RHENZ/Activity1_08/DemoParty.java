package MAWD202.NARANJO_RHENZ.Activity1_08;

import java.util.Scanner;
public class DemoParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DinnerParty dinnerParty = new DinnerParty();
        Party party = new Party();
        try {
            System.out.print("Enter the number of guests for the dinner party: ");
            int input1 = sc.nextInt();
            party.setNumGuests(input1);
            System.out.print("Enter the menu option (1 for chicken or 2 for beef): ");
            int input2 = sc.nextInt();
            dinnerParty.setFoodChoice(input2);

            System.out.println("The dinner party has " + party.getNumGuests() + " guest.");
            System.out.println("Menu option " + dinnerParty.getFoodChoice() + " wil be served.");
            dinnerParty.showInvitation();
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}
