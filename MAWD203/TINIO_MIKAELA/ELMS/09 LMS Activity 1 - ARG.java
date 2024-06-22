import java.util.Scanner;
public class DemoParty {
    public static void main (String[] args){
        Scanner scanner= new Scanner(System.in);
        Party P = new Party();
        DinnerParty DP = new DinnerParty();
        System.out.println("Enter the number of guests for the dinner party: ");
        int Number = scanner.nextInt();
        System.out.println("Enter the menu option(1 for chicken or 2 for beef): ");
        int Menu = scanner.nextInt();
        P.setNumGuests(Number);
        DP.setFoodChoice(Menu);
        System.out.println("The dinner party has "+P.getNumGuests()+" guests.");
        System.out.println("Menu option "+DP.getFoodChoice()+" will be served.");
        DP.showInvitation();
        scanner.close();
    }
}

class Party {
    private int numGuests;
    public int getNumGuests(){
        return numGuests;
    }
    public void setNumGuests(int num){
        this.numGuests = num;
    }
    public void showInvitation(){
        System.out.println("Please come to my party!");
    }
}
class DinnerParty extends Party {
    private int foodChoice;
    public int getFoodChoice(){
        return foodChoice;
    }
    public void setFoodChoice(int choice){
        this.foodChoice = choice;
    }
    @Override
    public void showInvitation(){
        System.out.println("Please come to my dinner party!");
    }
}
