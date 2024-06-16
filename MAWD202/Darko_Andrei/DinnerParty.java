public class DinnerParty extends Party {
    public int foodChoice;

    public int getFoodChoice() {
        return foodChoice;
    }

    public void setFoodChoice(int choice) {
        this.foodChoice = choice;
    }

    @Override
    public void showInvitation() {
        System.out.println("Please come to my dinner party!");
    }
}
