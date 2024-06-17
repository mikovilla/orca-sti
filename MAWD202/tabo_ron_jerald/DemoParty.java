
import java.util.Scanner;

public class DemoParty {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number of guests for the dinner party: ");
        int guests = scn.nextInt();

        System.out.println("Enter food choice (1 for chicken, 2 for beefsteak): ");
        
        int foodChoice = scn.nextInt();
        
        DemoParty dinner = new DemoParty();
        dinner.setNumGuests(guests);
        dinner.setFoodChoice(foodChoice);
        dinner.setTotalGuests(guests);

        dinner.showInvitation();

        scn.close();
    }
}