package demoparty;

public class DinnerParty extends Party {

    private int foodChoice;

    public int getFoodChoice() {
        return foodChoice;
    }

    public void setFoodChoice(int choice) {
        this.foodChoice = choice;
    }

   public String getDishName() {
        return switch (foodChoice) {
            case 1 -> "Chicken";
            case 2 -> "Fish";
            case 3 -> "Steak";
            case 4 -> "Pasta";
            case 5 -> "Salad";
            default -> "KahitAno";
        };
    }

    @Override
    public void showInvitation() {
        System.out.println("Please come to my dinner party!");
    }
}