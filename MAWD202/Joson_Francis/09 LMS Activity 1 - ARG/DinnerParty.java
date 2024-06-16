import java.util.InputMismatchException;
import java.util.Scanner;

public class DinnerParty extends Party {
    private int foodChoice;

    public int getFoodChoice() {
        return foodChoice;
    }

    public void setFoodChoice(int choice) {
        if (choice != 1 && choice != 2) {
            throw new IllegalArgumentException("Please pick only from choice 1 or choice 2!!");
        }
        foodChoice = choice;
    }

    @Override
    public void showInvitation() {
        System.out.println("Please come to my dinner party!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DinnerParty dinnerParty = new DinnerParty();

        System.out.print("Enter the number of guests for the dinner party: ");
        int numGuests = scanner.nextInt();
        dinnerParty.setNumGuests(numGuests);

        boolean validChoice = false;
        while (!validChoice) 
        {
            try {System.out.print("Enter the menu option (1 for chicken or 2 for beef): ");
                int foodChoice = scanner.nextInt();
                dinnerParty.setFoodChoice(foodChoice);
                validChoice = true;} 

            catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); } 

            catch (IllegalArgumentException e) 
            {System.out.println(e.getMessage());scanner.nextLine();}
        }

        System.out.println("\nThe dinner party has " + dinnerParty.getNumGuests() + " guests.");
        System.out.println("Menu option " + dinnerParty.getFoodChoice() + " will be served.");

      
        dinnerParty.showInvitation();

        scanner.close();
    }
}
