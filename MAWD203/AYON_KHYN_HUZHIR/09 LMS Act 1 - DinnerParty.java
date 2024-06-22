public class DinnerParty extends Party { 
  private int foodChoice;

public int getFoodChoice() {
  return foodChoice;
 }

//same concept w/o and with parameters 

public void setFoodChoice(int choice) { 
   this.foodChoice = choice;
 }


// ^~^
@Override public void showInvitation() { 
   System.out.println("Please come to my dinner party!"); 
   
  }
}
