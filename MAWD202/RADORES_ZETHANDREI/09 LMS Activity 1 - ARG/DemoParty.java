public class DemoParty {
    public static void main(String[] args) {

        DinnerParty dinnerParty = new DinnerParty();

        dinnerParty.setNumGuests(30);

        dinnerParty.setFoodChoice(1); 

        System.out.println("The dinner party has " + dinnerParty.getNumGuests() + " guests.");
        System.out.println("Menu option " + dinnerParty.getFoodChoice() + " will be served.");

        dinnerParty.showInvitation();
    }
}
