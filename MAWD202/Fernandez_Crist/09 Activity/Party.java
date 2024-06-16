package demoparty;

public class Party {
    private int numGuests; // Private variable to store the number of guests

    // Getter method for numGuests
    public int getNumGuests() {
        return numGuests;
    }

    // Setter method for numGuests
    public void setNumGuests(int num) {
        this.numGuests = num;
    }

    // Method to show invitation message
    public void showInvitation() {
        System.out.println("Please come to my party! or not i dont care!");
    }
}
