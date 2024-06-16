public class Party {
    private int numGuests;

    public Party() {
        numGuests = 0;
    }

    public int getNumGuests() {
        return numGuests;
    }

    public void setNumGuests(int num) {
        numGuests = num;
    }

    public void showInvitation() {
        System.out.println("Please come to my party!");
    }
}
