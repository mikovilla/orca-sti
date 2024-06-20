package demoparty;

public class DinnerParty extends Party 
{
    private int foodChoice;
    
    public void setFoodChoice(int choice)
    {
        this.foodChoice = choice;
    }
    
    public int getFoodChoice()
    {
        return foodChoice;
    }
    
    public void showInvitation()
    {
        System.out.println("Please come to my dinner party!");
    }
}
