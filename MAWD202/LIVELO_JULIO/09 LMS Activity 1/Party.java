public class Party {
    private int numGuests = 0;

    public int getNumGuests() {
        return numGuests;
    }

    public void setNumGuests(int numGuests) {
        this.numGuests = numGuests;
    }

    public void showInvitation() {
        System.out.println("Please come to my party!");
    }

}