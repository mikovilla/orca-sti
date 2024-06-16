import java.util.Scanner;
public class DemoParty {
    public static void main(String[] args) {
        DinnerParty dinnerParty = new DinnerParty();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of guests for the dinner party: ");
        int numGuests = scanner.nextInt();
        dinnerParty.setNumGuests(numGuests);

        System.out.println("Enter the menu option (1 for chicken or 2 for beef): ");
        int foodChoice = scanner.nextInt();
        dinnerParty.setFoodChoice(foodChoice);

        System.out.println("The dinner party has " + dinnerParty.getNumGuests() + " guests.");

        if (dinnerParty.getFoodChoice() == 1) {
            System.out.println("Menu option 1 will be served.");
        } else if (dinnerParty.getFoodChoice() == 2) {
            System.out.println("Menu option 2 will be served.");
        } else {
            System.out.println("Invalid menu option.");
        }

        dinnerParty.showInvitation();
    }
}
