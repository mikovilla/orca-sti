import java.util.Scanner;

public class DemoParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DinnerParty dinnerParty = new DinnerParty();

        System.out.print("Enter the number of guests for the dinner party: ");
        int numGuests = scan.nextInt();
        dinnerParty.setNumGuests(numGuests);

        System.out.print("Enter the menu option (1 for chicken or 2 for beef): ");
        int menuOption = scan.nextInt();
        dinnerParty.setFoodChoice(menuOption);

        System.out.println("The dinner party has " + dinnerParty.getNumGuests() + " guests.");
        System.out.println("Menu option " + dinnerParty.getFoodChoice() + " will be served.");

        dinnerParty.showInvitation();

        scan.close();
    }
}
