public class DemoParty {
    public static void main(String[] args) {
        Party party = new Party();
        party.setNumGuests(5);
        System.out.println("Number of guests for the party: " + party.getNumGuests());
        party.showInvitation();

        DinnerParty dinnerParty = new DinnerParty();
        dinnerParty.setNumGuests(10);
        dinnerParty.setFoodChoice(2);
        System.out.println("Number of guests for the dinner party: " + dinnerParty.getNumGuests());
        System.out.println("Food choice for the dinner party: " + dinnerParty.getFoodChoice());
        dinnerParty.showInvitation();
    }
}
