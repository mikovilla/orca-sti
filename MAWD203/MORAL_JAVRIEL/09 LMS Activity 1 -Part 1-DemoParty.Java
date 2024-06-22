// The main point that which is gonna print all the method we use.
public class DemoParty {
    public static void main(String[] args) {
        Party party = new Party();
        party.setNumGuests(20);
        System.out.println("Number of guests for the party: " + party.getNumGuests());
        party.showInvitation();

        DinnerParty dinnerParty = new DinnerParty();
        dinnerParty.setNumGuests(15);
        dinnerParty.setFoodChoice(2);
        System.out.println("Number of guests for the dinner party: " + dinnerParty.getNumGuests());
        System.out.println("Food choice for the dinner party: " + dinnerParty.getFoodChoice());
        dinnerParty.showInvitation();
    }
}
