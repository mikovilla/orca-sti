package demoparty;

public class DinnerParty extends Party {
    
    private int foodChoise;
    
    public int getFoodChoise() {
        return foodChoise;
    }
    
    public void setFoodChoise(int choise) {
        this.foodChoise = choise;
    }
    
    public void showInvitation() {
        System.out.println("Please come to my dinner party!");
    }
}
