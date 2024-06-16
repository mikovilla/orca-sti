package party;
public class Party {
    private int numGuests = 0;

    public int  getNumGuests()        {return this.numGuests;}
    public void setNumGuests(int num) {this.numGuests = num;}

    public void showInvite()          {System.out.println("Please come to my party!");}
}