package party;
public class DinnerParty extends Party {
    private int foodChoice = 0;

    public int  getFoodChoice()               {return this.foodChoice;}
    public void setFoodChoice(int choice) {this.foodChoice = choice;}

    @Override
    public void showInvite() {System.out.println("Please come to my dinner party!");}
}
