package demoparty;

public class DinnerParty extends Party {
    private int foodChoice; 

    // Getter method for foodChoice
    public int getFoodChoice() {
        return foodChoice;
    }

    // Setter method for foodChoice
    public void setFoodChoice(int choice) {
        this.foodChoice = choice;
    }

    // Method to show dinner party invitation message
    @Override
    public void showInvitation() {
        System.out.println("Please come to my dinner party!");
    }
}
