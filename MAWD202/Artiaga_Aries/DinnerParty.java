class DinnerParty extends Party {
    private int foodChoice;

    public DinnerParty() {
        foodChoice = 0;
    }

    public int getFoodChoice() {
        return foodChoice;
    }

    public void setFoodChoice(int choice) {
        foodChoice = choice;
    }

    @Override
    public void showInvitation() {
        System.out.println("Please come to my dinner party!");
    }
}
