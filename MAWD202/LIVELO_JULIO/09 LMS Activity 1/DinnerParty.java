public class DinnerParty extends Party {
    private int foodChoice = 0;

    public int getFoodChoice() {
        return foodChoice;
    }

    public void setFoodChoice(int foodChoice) {
        this.foodChoice = foodChoice;
    }

    @Override
    public void showInvitation() {
        System.out.println("Please come to my dinner party!");
    }
}
