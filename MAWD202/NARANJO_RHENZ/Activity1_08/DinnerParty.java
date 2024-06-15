package MAWD202.NARANJO_RHENZ.Activity1_08;

public class DinnerParty extends Party{
    private int foodChoice;

    public int getFoodChoice() {
        return foodChoice;
    }
    public void setFoodChoice(int choice) {
        this.foodChoice = choice;
    }
    @Override
    public void showInvitation(){
        System.out.println("Please come to my dinner party!");
    }
}

