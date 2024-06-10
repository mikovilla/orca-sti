import java.util.Scanner;

public class DemoParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DinnerParty dinnerParty = new DinnerParty();

        System.out.print("Enter the number of guests for the dinner party: ");
        int numGuests = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        dinnerParty.setNumGuests(numGuests);

        System.out.print("Enter the menu option (3 for beef or 2 for bacon): ");
        int menuOption = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        dinnerParty.setFoodChoice(menuOption);

        System.out.println("The dinner party has " + dinnerParty.getNumGuests() + " guests.");
        System.out.println("Menu option " + dinnerParty.getFoodChoice() + " will be served.");
        dinnerParty.showInvitation();
    }
}
