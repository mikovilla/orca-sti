package party;

import java.util.Scanner;

public class DemoParty {
    public static void main(String[] args) {
        DinnerParty dess = new DinnerParty();

        int guests = 0;
        int food   = 0;

        Scanner scr = new Scanner(System.in);

        System.out.print("Enter number of guests: "); guests = scr.nextInt();
        System.out.print("Enter food choice (1 chicken, 2 beef): "); food = scr.nextInt();

        dess.setFoodChoice(food);
        dess.setNumGuests(guests);

        scr.close();

        System.out.println("\nDinner party will have "+ dess.getNumGuests() + " guest(s).");
        System.out.println("Serving menu option " + dess.getFoodChoice());
        dess.showInvite();
    }

    static String getInput() {
        try (Scanner scr = new Scanner(System.in)) {
            return scr.nextLine();
        } catch (Exception e) {
            return "";
        }
    }
    static String ask(String prompt) {System.out.print(prompt); return getInput();}
}
