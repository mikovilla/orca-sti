import java.util.Scanner;

public class DemoParty {
    public static Scanner Input = new Scanner(System.in);

    public static void main(String[] args) {
        DinnerParty DP = new DinnerParty();
        System.out.print("Enter the number of guests for the dinner party: ");
        DP.setNumGuest(AskInt());
        System.out.print("Enter the menu option (1 for chicken or 2 for beef): ");

        int i;
        while (true) {
            i = AskInt();
            if (i >= 1 && i <= 2)
                break;
            System.out.print("Invalid Input Please Enter 1 or 2: ");
        }
        DP.setFoodChoice(i);

        System.out.println("The dinner party has " + DP.getNumGuest() + " guests.");
        System.out.println("Menu option " + DP.getFoodChoice() + " will be served.");
        DP.showInvitation();

        Input.close();
    }

    public static int AskInt() {
        while (true) {
            try {
                return Input.nextInt();
            } catch (Exception e) {
                Input.next();
                System.out.print("Invalid Input Please Enter A Number: ");
            }
        }
    }
}
