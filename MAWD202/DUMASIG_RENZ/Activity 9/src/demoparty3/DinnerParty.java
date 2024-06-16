package demoparty3;

public class DinnerParty extends Party {
    
    private int foodChoise;
    
    public int getFoodChoise() {
        return foodChoise;
    }
    
    public void setFoodChoise(int choise) {
        this.foodChoise = choise;
    }
    
    @Override
    public void showInvitation() {
        System.out.println("Please come to my dinner party! Ayaw Mo? EDI WAG!");
    }
}