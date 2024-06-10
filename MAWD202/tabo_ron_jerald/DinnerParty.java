public class DinnerParty extends Party {
    private int foodChoice;
    private int totalGuests;

    public int getFoodChoice() {
        return foodChoice;
    }

    public void setFoodChoice(int choice) {
        foodChoice = choice;
    }

    public void setTotalGuests(int total) {
        totalGuests = total;
    }

    public int getTotalGuests() {
        return totalGuests;
    }
   
    public void showInvitation() {
        System.out.print("Please come to my dinner party! ");
        if (foodChoice == 1) {
            System.out.println("We'll be serving chicken.");
        } else if (foodChoice == 2) {
            System.out.println("We'll be serving beefsteak.");
        } else {
            System.out.println("Food choice not recognized.");
        }
        System.out.println("Total number of guests: " + getTotalGuests());
    }
}

